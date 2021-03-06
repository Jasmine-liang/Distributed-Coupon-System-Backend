package com.passbook.constant;

/*
* <h1>普通常量定义</h1>
* */
public class Constants {
    /*商户优惠券投放的 Kafka Topic*/
    public static final String TEMPLATE_TOPIC = "merchants-template";
    /*token string*/
    public static final String TOKEN_STRING = "token";
    /*token info, 为了简单，所有商户使用同一个token*/
    public static final String TOKEN = "imooc-passbook-merchants";
}
