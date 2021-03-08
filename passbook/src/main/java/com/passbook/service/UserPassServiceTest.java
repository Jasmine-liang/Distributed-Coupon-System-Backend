package com.passbook.service;

import com.alibaba.fastjson.JSON;
import com.passbook.vo.Pass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/*
* 用户优惠券服务测试
*
* */
//@RunWith(SpringRunner.class)
//@SpringBootTest
//public class UserPassServiceTest extends AbstractServiceTest{
//    @Autowired
//    private IUserPassService userPassService;
/*
* "data":[
   {
      "merchants":{
         "address":"Beijing",
         "businessLicenseUrl":"www.google.com",
         "id":18,
         "isAudit":true,
         "logoUrl":"www.google.com",
         "name":"幕客",
         "phone":"12344"
      },
      "pass":{
         "assignedDate":1610035200000,
         "templateId":"45574824de5ff3eb0fa66b764e765433",
         "token":"token-3",
         "userId":484980
      },
      "passTemplate":{
         "backgroud":2,
         "desc":"asd",
         "end":1615996800000,
         "hasToken":true,
         "id":18,
         "limit":9999,
         "start":1614268800000,
         "summary":"幕客",
         "title":"幕客-has-token"
      }
   }
],
        "errorCode":0,
        "errorMsg":""
}
*
* */
   // @Test
//    public void testGetUserPassInfo() throws Exception{
//        System.out.println(JSON.toJSONString(
//                userPassService.getUserPassInfo(userId)
//        ));
//
//    }

    // {"data":[],"errorCode":0,"errorMsg":""}
   // @Test
//    public void testGetUserUsedPassInfo() throws Exception {
//        System.out.println(JSON.toJSONString(
//                userPassService.getUserUsedPassInfo(userId)
//        ));
//    }


    /*
    * {
   "data":[
      {
         "merchants":{
            "address":"Beijing",
            "businessLicenseUrl":"www.google.com",
            "id":18,
            "isAudit":true,
            "logoUrl":"www.google.com",
            "name":"幕客",
            "phone":"12344"
         },
         "pass":{
            "assignedDate":1610035200000,
            "templateId":"45574824de5ff3eb0fa66b764e765433",
            "token":"token-3",
            "userId":484980
         },
         "passTemplate":{
            "backgroud":2,
            "desc":"asd",
            "end":1615996800000,
            "hasToken":true,
            "id":18,
            "limit":9999,
            "start":1614268800000,
            "summary":"幕客",
            "title":"幕客-has-token"
         }
      }
   ],
   "errorCode":0,
   "errorMsg":""
}
    *
    * */
   // @Test
//    public void testGetUserAllPassInfo() throws Exception {
//        System.out.println(JSON.toJSONString(
//                userPassService.getUserAllPassInfo(userId)
//        ));
//    }

    /*
    * {"errorCode":0,"errorMsg":""}
    * */
    //@Test
//    public void testUserUsePass(){
//        Pass pass = new Pass();
//        pass.setUserId(userId);
//        pass.setTemplateId("45574824de5ff3eb0fa66b764e765433");
//
//        System.out.println(JSON.toJSONString(
//                userPassService.userUsePass(pass)
//        ));
//
//
//    }
//}
