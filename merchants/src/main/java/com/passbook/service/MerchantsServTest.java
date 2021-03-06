package com.passbook.service;

/*
* 商户服务测试类
* */
//@RunWith(SpringJUnit4ClassRunner.class)
//@SpringBootTest
////        (webEnvironment = SpringBootTest.WebEnvironment.NONE)
//public class MerchantsServTest {
//
//    @Autowired(required = true)
//    private IMerchantsServ merchantsServ;
//
//    //@Test
//    //@Transactional
//    public void testCreateMerchantServ(){
//        CreateMerchantsRequest request = new CreateMerchantsRequest();
//        request.setName("幕客");
//        request.setLogoUrl("www.google.com");
//        request.setBusinessLicenseUrl("www.google.com");
//        request.setPhone("12344");
//        request.setAddress("Beijing");
//
//        System.out.println(JSON.toJSONString(merchantsServ.createMerchants(request)));
//    }
//   // @Test
//    public void testBuildMerchantsInfoById(){
//        System.out.println(JSON.toJSONString(merchantsServ.buildMerchantsInfoById(18)));
//    }
     /* 商户发消息到Kafka, 消费者去消费这条消息
     * DropPassTemplates: {"backgroud":2,"desc":"asd","end":1615279578998,"hasToken":false,"id":18,"limit":10000,"start":1614415578998,"summary":"幕客","title":"幕客"}
     * */
    //@Test
//    public void testDropPassTemplate(){
//        PassTemplate passTemplate = new PassTemplate();
//        passTemplate.setId(18);
//        passTemplate.setTitle("幕客-has-token");
//        passTemplate.setSummary("幕客");
//        passTemplate.setDesc("asd");
//        passTemplate.setLimit(10000L);
//        passTemplate.setHasToken(true);
//        passTemplate.setBackgroud(2);
//        passTemplate.setStart(DateUtils.addDays(new Date(), -10));
//        passTemplate.setEnd(DateUtils.addDays(new Date(), 10));
//        System.out.println(JSON.toJSONString(merchantsServ.dropPassTemplate(passTemplate)));
//
//    }
//}
