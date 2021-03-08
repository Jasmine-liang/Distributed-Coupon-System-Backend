package com.passbook.service;

import com.alibaba.fastjson.JSON;
import com.passbook.vo.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/*
* 用户服务测试
* */
//@RunWith(SpringRunner.class)
//@SpringBootTest
//public class UserServiceTest {
//    @Autowired
//    private IUserService userService;
//
//
//    @Test
//    public void testCreateUser() throws Exception{
//        User user = new User();
//        user.setBaseInfo(new User.BaseInfo("test", 10, "female"));
//        user.setOtherInfo(new User.OtherInfo("1232", "beijing"));
//        //{"data":{"baseInfo":{"age":10,"name":"test","sex":"female"},"id":484980,"otherInfo":{"address":"beijing","phone":"1232"}},"errorCode":0,"errorMsg":""}
//        System.out.println(JSON.toJSONString(userService.createUser(user)));
//
//    }
//}

