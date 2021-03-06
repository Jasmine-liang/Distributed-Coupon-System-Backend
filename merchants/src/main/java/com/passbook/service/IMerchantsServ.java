package com.passbook.service;

import com.passbook.vo.CreateMerchantsRequest;
import com.passbook.vo.PassTemplate;
import com.passbook.vo.Response;

/*
* 对商户服务接口定义
* */
public interface IMerchantsServ {
    /**
     * 创建商户服务
     * @param request 创建商户请求
     * @return
     */
    Response createMerchants(CreateMerchantsRequest request);

    /**
     *根据 id 构造商户信息
     * @param id 商户 id
     * @return
     */
    Response buildMerchantsInfoById(Integer id);

    /**
     * 投放优惠券
     * @param template {@link PassTemplate}优惠券对象
     * @return
     */
    Response dropPassTemplate(PassTemplate template);
}
