package com.passbook.service;

import com.passbook.vo.Response;

/*
* 获取库存信息：只返回给用户返回没有领取的，即库存功能实现接口定义
* */
public interface IInventoryService {
    /**
     * 获取库存信息
     * @param userId 用户id
     * @return  {@link Response}
     * @throws Exception
     */
    Response getInventoryInfo(Long userId) throws Exception;
}
