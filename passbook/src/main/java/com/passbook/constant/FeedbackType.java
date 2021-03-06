package com.passbook.constant;
/*
* 评论类型枚举
* */

public enum FeedbackType {

    PASS(1, "针对优惠券的评论"),
    APP(2, "针对卡包APP的评论");
    /*评论类型编码*/
    private Integer code;
    /*评论类型描述*/
    private String desc;

    FeedbackType(Integer code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
