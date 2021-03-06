package com.passbook.mapper;

import com.passbook.constant.Constants;
import com.passbook.vo.Feedback;
import com.spring4all.spring.boot.starter.hbase.api.RowMapper;
import org.apache.hadoop.hbase.client.Result;
import org.apache.hadoop.hbase.util.Bytes;

import java.nio.charset.StandardCharsets;

/*
* Feedback HBase Row To Object
* */
public class FeedbackRowMapper implements RowMapper<Feedback> {
    private static byte[] FAMILY_I = Constants.FeedBack.FAMILY_I.getBytes();
    private static byte[] USER_ID = Constants.FeedBack.USER_ID.getBytes();
    private static byte[] TYPE = Constants.FeedBack.TYPE.getBytes();
    private static byte[] TEMPLATE_ID = Constants.FeedBack.TEMPLATE_ID.getBytes();
    private static byte[] COMMENT = Constants.FeedBack.COMMENT.getBytes();


    @Override
    public Feedback mapRow(Result result, int i) throws Exception {
       Feedback feedback = new Feedback();
       feedback.setUserId(Bytes.toLong(result.getValue(FAMILY_I, USER_ID)));
       feedback.setType(Bytes.toString(result.getValue(FAMILY_I, TYPE)));
       feedback.setTemplateId(Bytes.toString(result.getValue(FAMILY_I, TEMPLATE_ID)));
       feedback.setComment(Bytes.toString(result.getValue(FAMILY_I, COMMENT)));
       return  feedback;

    }
}
