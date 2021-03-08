package com.passbook.service;

import com.alibaba.fastjson.JSON;
import com.passbook.constant.FeedbackType;
import com.passbook.vo.Feedback;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/*
* 用户反馈服务测试
* */
//@RunWith(SpringRunner.class)
//@SpringBootTest
//public class FeedbackServiceTest extends AbstractServiceTest{
//    @Autowired
//    private IFeedbackService feedbackService;
//
//   // @Test
//    public void testCreateFeedback(){
//        Feedback appFeedback = new Feedback();
//        appFeedback.setUserId(userId);
//        appFeedback.setType(FeedbackType.APP.getCode());
//        appFeedback.setTemplateId("-1");
//        appFeedback.setComment("APP评论");
//        System.out.println(JSON.toJSONString(
//                feedbackService.createFeedback(appFeedback)
//        ));
//
//        Feedback passFeedback = new Feedback();
//        passFeedback.setUserId(userId);
//        passFeedback.setType(FeedbackType.PASS.getCode());
//        passFeedback.setTemplateId("45574824de5ff3eb0fa66b764e765433");
//        passFeedback.setComment("优惠券评论");
//        System.out.println(JSON.toJSONString(
//                feedbackService.createFeedback(passFeedback)
//        ));
//
//        /*{"errorCode":0,"errorMsg":""}
//          {"errorCode":0,"errorMsg":""}
//        *
//        * */
//
//
//    }
//
//  //  @Test
//    public void testGetFeedback(){
//        System.out.println(JSON.toJSONString(
//                feedbackService.getFeedback(userId)
//        ));
//    }
//    /*{
//   "data":[
//      {
//         "comment":"优惠券评论",
//         "templateId":"45574824de5ff3eb0fa66b764e765433",
//         "type":"pass",
//         "userId":484980
//      },
//      {
//         "comment":"APP评论",
//         "templateId":"-1",
//         "type":"app",
//         "userId":484980
//      }
//   ],
//   "errorCode":0,
//   "errorMsg":""
//}
//    * */
//}
