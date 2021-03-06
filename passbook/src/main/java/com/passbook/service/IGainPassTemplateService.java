package com.passbook.service;

import com.passbook.vo.GainPassTemplateRequest;
import com.passbook.vo.Response;

/**
 * 用户领取优惠券功能实现
 */
public interface IGainPassTemplateService {
    /**
     * 用户领取优惠券
     * @param request {@link GainPassTemplateRequest}
     * @return  {@link Response}
     * @throws Exception
     */
    Response gainPassTemplate(GainPassTemplateRequest request) throws Exception;
}
