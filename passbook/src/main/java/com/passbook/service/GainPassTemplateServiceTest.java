package com.passbook.service;

import com.alibaba.fastjson.JSON;
import com.passbook.vo.GainPassTemplateRequest;
import com.passbook.vo.PassTemplate;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/*
* 用户领取优惠券功能测试
* 从HBase中'pb:passtemplate'中领取优惠券，并写入用户领取的优惠券写入'pb:pass'，并将redis中的token分配给这张优惠券，最后将已使用的token记录到文件中。
* */
//@RunWith(SpringRunner.class)
//@SpringBootTest
//public class GainPassTemplateServiceTest extends AbstractServiceTest{
//    @Autowired
//    private IGainPassTemplateService gainPassTemplateService;
//
//    //result: {"errorCode":0,"errorMsg":""}
//   // @Test
//    public void testGainPassTemplate() throws Exception{
//        PassTemplate target = new PassTemplate();
//        target.setId(18);
//        target.setTitle("幕客-has-token");
//        target.setHasToken(true);
//
//        System.out.println(JSON.toJSONString(
//                gainPassTemplateService.gainPassTemplate(
//                        new GainPassTemplateRequest(userId, target)
//                )
//        ));
//
//    }
//
//
//}
