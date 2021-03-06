package com.passbook.service;

import com.passbook.vo.Response;
import com.passbook.vo.User;

/*
* 用户服务： 创建User服务，写入HBase
* */
public interface IUserService {
    /**
     * 创建用户
     * @param user {@link User}
     * @return  {@link Response}
     * @throws Exception
     */
    Response createUser(User user) throws Exception;
}
