package com.passbook.vo;


import com.passbook.constant.FeedbackType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.hbase.thirdparty.com.google.common.base.Enums;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class Feedback {
    /*用户 id*/
    private Long userId;
    /*评论类型*/
    private String type;
    /*PassTemplate RowKey, 如果使app类型的评论，则没有*/
    private String templateId;
    /*评论内容*/
    private String comment;


    public boolean validate(){
        FeedbackType feedbackType = Enums.getIfPresent(
                FeedbackType.class, this.type.toUpperCase()
        ).orNull();
        return !(null == feedbackType || null == comment);
    }
}
