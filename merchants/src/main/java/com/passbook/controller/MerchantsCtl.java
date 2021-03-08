package com.passbook.controller;

import com.alibaba.fastjson.JSON;
import com.passbook.service.IMerchantsServ;
import com.passbook.vo.CreateMerchantsRequest;
import com.passbook.vo.PassTemplate;
import com.passbook.vo.Response;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/*
* 商户服务Controller
* */
@Slf4j
@RestController
@RequestMapping(value = "/merchants")
public class MerchantsCtl {
    /*商户服务接口*/
    private IMerchantsServ merchantsServ;
    @Autowired
    public MerchantsCtl(IMerchantsServ merchantsServ) {

        this.merchantsServ = merchantsServ;
    }
    @ResponseBody
    @PostMapping(value = "/create")
    public Response createMerchants(@RequestBody CreateMerchantsRequest request){
        log.info("CreateMerchants: {}", JSON.toJSONString(request));
        return merchantsServ.createMerchants(request);

    }
    @ResponseBody
    @GetMapping(value = "/{id}")
    public Response buildMerchantsInfo(@PathVariable Integer id){
        log.info("BuildMerchantsInfo: {}", id);
        return merchantsServ.buildMerchantsInfoById(id);

    }
    /*
    *
    * {"background":1,"desc":"test","end":1615279578998,"hasToken":false,"id":18,"limit":1000,"start":1614415578998,"summary":"å¹å®¢","title":"å¹å®¢"}]
    * */
    @ResponseBody
    @PostMapping(value = "/drop")
    public Response dropPassTemplate(@RequestBody PassTemplate passTemplate){
        log.info("DropPassTemplate: {}", passTemplate);
        return merchantsServ.dropPassTemplate(passTemplate);
    }
}
