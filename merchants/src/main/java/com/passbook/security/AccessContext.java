package com.passbook.security;
/*
* 用ThreadLocal去单独存储一个线程携带的Token信息
* */
public class AccessContext {
    private static final ThreadLocal<String> token = new ThreadLocal<>();

    public static String getToken(){
        return token.get();
    }
    public static void setToken(String tokenStr){
        token.set(tokenStr);
    }
    public static void clearAccessKey(){
        token.remove();
    }
}
