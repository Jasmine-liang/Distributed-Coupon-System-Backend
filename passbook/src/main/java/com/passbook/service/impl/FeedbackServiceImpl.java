package com.passbook.service.impl;

import com.alibaba.fastjson.JSON;
import com.passbook.constant.Constants;
import com.passbook.mapper.FeedbackRowMapper;
import com.passbook.service.IFeedbackService;
import com.passbook.utils.RowKeyGenUtil;
import com.passbook.vo.Feedback;
import com.passbook.vo.Response;
import com.spring4all.spring.boot.starter.hbase.api.HbaseTemplate;
import lombok.extern.slf4j.Slf4j;
import org.apache.hadoop.hbase.client.Put;
import org.apache.hadoop.hbase.client.Scan;
import org.apache.hadoop.hbase.filter.PrefixFilter;
import org.apache.hadoop.hbase.util.Bytes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/*
* 评论功能实现
*
* */
@Service
@Slf4j
public class FeedbackServiceImpl implements IFeedbackService {
   /*HBase 客户端*/
    @Autowired
   private HbaseTemplate hbaseTemplate;

    public FeedbackServiceImpl(HbaseTemplate hbaseTemplate) {
        this.hbaseTemplate = hbaseTemplate;
    }

    @Override
    public Response createFeedback(Feedback feedback) {
        if (!feedback.validate()){
            log.error("Feedback Error: {}", JSON.toJSONString(feedback));
            return Response.failure("Feedback Error");
        }
        Put put = new Put(Bytes.toBytes(RowKeyGenUtil.genFeedbackRowKey(feedback)));
        put.addColumn(
                Bytes.toBytes(Constants.FeedBack.FAMILY_I),
                Bytes.toBytes(Constants.FeedBack.USER_ID),
                Bytes.toBytes(feedback.getUserId())
        );
        put.addColumn(
                Bytes.toBytes(Constants.FeedBack.FAMILY_I),
                Bytes.toBytes(Constants.FeedBack.TYPE),
                Bytes.toBytes(feedback.getType())
        );
        put.addColumn(
                Bytes.toBytes(Constants.FeedBack.FAMILY_I),
                Bytes.toBytes(Constants.FeedBack.TEMPLATE_ID),
                Bytes.toBytes(feedback.getTemplateId())
        );
        put.addColumn(
                Bytes.toBytes(Constants.FeedBack.FAMILY_I),
                Bytes.toBytes(Constants.FeedBack.COMMENT),
                Bytes.toBytes(feedback.getComment())
        );
        hbaseTemplate.saveOrUpdate(Constants.FeedBack.TABLE_NAME, put);
        return Response.sucess();
    }

    @Override
    public Response getFeedback(Long userId) {

        byte[] reverseUserId = new StringBuilder(String.valueOf(userId)).reverse().toString().getBytes();
        Scan scan = new Scan();
        scan.setFilter(new PrefixFilter(reverseUserId));

        List<Feedback> feedbacks = hbaseTemplate.find(Constants.FeedBack.TABLE_NAME, scan, new FeedbackRowMapper());

        return new Response(feedbacks);
    }
}
