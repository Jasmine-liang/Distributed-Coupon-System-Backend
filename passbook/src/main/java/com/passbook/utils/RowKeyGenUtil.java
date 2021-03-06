package com.passbook.utils;

import com.passbook.vo.Feedback;
import com.passbook.vo.GainPassTemplateRequest;
import com.passbook.vo.PassTemplate;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.codec.digest.DigestUtils;

/*
* RowKey 生成器工具类
* */
@Slf4j
public class RowKeyGenUtil {
    /**
     * 根据提供的 PassTemplate 对象生成 RowKey
     * @param passTemplate {@link PassTemplate}
     * @return String RowKey
     */
    public static String genPassTemplateRowKey(PassTemplate passTemplate){
        String passInfo = String.valueOf(passTemplate.getId()) + "_" + passTemplate.getTitle();
        String rowKey = DigestUtils.md5Hex(passInfo);
        log.info("GenPassTemplateRowKey: {}, {}", passInfo, rowKey);
        return rowKey;
    }

    /**
     * 根据提供的领取优惠券请求生成RowKey, 只可以在领取优惠券的时候使用
     * Pass RowKey = reversed(userId) + inverse(timestamp) + PassTemplate RowKey
     * @param request {@link GainPassTemplateRequest}
     * @return String RowKey
     */
    public static String genPassRowKey(GainPassTemplateRequest request){
            return new StringBuilder(String.valueOf(request.getUserId())).reverse().toString()
                    + (Long.MAX_VALUE - System.currentTimeMillis())
                    + genPassTemplateRowKey(request.getPassTemplate());
    }
    /**
     * 根据Feedback 构造RowKey
     * @param feedback {@link Feedback}
     * @return String RowKey
     */
    public static String genFeedbackRowKey(Feedback feedback){
        /*此设计方式可以让我们获得最新的用户feedback*/
        /*
        * 当前的时间戳是存储时的时间戳，同一个user_id, 越晚创建的feedback值是在最前面
        * */
        return new StringBuilder(String.valueOf(feedback.getUserId())).reverse().toString()
                + (Long.MAX_VALUE - System.currentTimeMillis());
    }
}
