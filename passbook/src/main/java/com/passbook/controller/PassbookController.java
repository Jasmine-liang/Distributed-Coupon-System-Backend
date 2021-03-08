package com.passbook.controller;

import com.passbook.log.LogConstans;
import com.passbook.log.LogGenerator;
import com.passbook.service.IFeedbackService;
import com.passbook.service.IGainPassTemplateService;
import com.passbook.service.IInventoryService;
import com.passbook.service.IUserPassService;
import com.passbook.vo.Feedback;
import com.passbook.vo.GainPassTemplateRequest;
import com.passbook.vo.Pass;
import com.passbook.vo.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

/*
* Passbook Rest Controller
* */
@Service
@RestController
@RequestMapping("/passbook")
public class PassbookController {

    /*用户优惠券服务*/
    @Autowired
    private IUserPassService userPassService;

    /*优惠券库存服务*/
    @Autowired
    private IInventoryService inventoryService;

    /*领取优惠券服务*/
    @Autowired
    private IGainPassTemplateService gainPassTemplateService;

    /*反馈服务*/
    @Autowired
    private IFeedbackService feedbackService;

    /*HttpServletRequest */
    @Autowired
    private HttpServletRequest httpServletRequest;


    public PassbookController(IUserPassService userPassService, IInventoryService inventoryService, IGainPassTemplateService gainPassTemplateService, IFeedbackService feedbackService, HttpServletRequest httpServletRequest) {
        this.userPassService = userPassService;
        this.inventoryService = inventoryService;
        this.gainPassTemplateService = gainPassTemplateService;
        this.feedbackService = feedbackService;
        this.httpServletRequest = httpServletRequest;
    }

    /**
     * 获取用户个人的优惠券信息
     * @param userId 用户 id
     * @return {@link Response}
     * @throws Exception
     */
    @ResponseBody
    @GetMapping("/userpassinfo")
    Response userPassInfo(Long userId) throws Exception{
        LogGenerator.genLog(
                httpServletRequest,
                userId,
                LogConstans.ActionName.USER_PASS_INFO,
                null
        );
        return userPassService.getUserPassInfo(userId);
    }

    /**
     * 获取用户使用的了优惠券信息
     * @param userId 用户id
     * @return {@link Response}
     * @throws Exception
     */
    @ResponseBody
    @GetMapping("/userusedpassinfo")
    Response userUsedPassInfo(Long userId) throws  Exception{
        LogGenerator.genLog(
                httpServletRequest,
                userId,
                LogConstans.ActionName.USER_USED_PASS_INFO,
                null
        );
        return userPassService.getUserUsedPassInfo(userId);
    }

    /**
     * 用户使用优惠券
     * @param pass {@link Pass}
     * @return {@link Response}
     */
    @ResponseBody
    @PostMapping("/userusePass")
    Response userUsePass(@RequestBody Pass pass){
        LogGenerator.genLog(
                httpServletRequest,
                pass.getUserId(),
                LogConstans.ActionName.USER_USE_PASS,
                pass
        );
        return  userPassService.userUsePass(pass);
    }

    /**
     * 获取库存信息
     * @param userId 用户id
     * @return {@link Response}
     * @throws Exception
     */
    @ResponseBody
    @GetMapping("/inventoryinfo")
    Response inventoryInfo(Long userId) throws Exception{
        LogGenerator.genLog(
                httpServletRequest,
                userId, LogConstans.ActionName.INVENTORY_INFO,
                null
        );
        return inventoryService.getInventoryInfo(userId);
    }

    /**
     * 用户领取优惠券
     * @param request {@link GainPassTemplateRequest}
     * @return {@link Response}
     * @throws Exception
     */
    @ResponseBody
    @PostMapping("gainpasstemplate")
    Response gainPassTemplate(@RequestBody GainPassTemplateRequest request) throws Exception{
            LogGenerator.genLog(
                    httpServletRequest,
                    request.getUserId(),
                    LogConstans.ActionName.GAIN_PASS_TEMPLATE,
                    request
            );
            return gainPassTemplateService.gainPassTemplate(request);
    }

    /**
     * 用户创建评论
     * @param feedback {@link Feedback}
     * @return {@link Response}
     */
    @ResponseBody
    @PostMapping("/createfeedback")
    Response createFeedback(@RequestBody Feedback feedback){
            LogGenerator.genLog(
                    httpServletRequest,
                    feedback.getUserId(),
                    LogConstans.ActionName.CREATE_FEEDBACK,
                    feedback
            );
            return feedbackService.createFeedback(feedback);
    }

    /**
     * 用户获取评论信息
     * @param userId 用户id
     * @return {@link Response}
     */
    @ResponseBody
    @GetMapping("/getfeedback")
    Response getFeedback(Long userId){
        LogGenerator.genLog(
                httpServletRequest,
                userId,
                LogConstans.ActionName.GET_FEEDBACK,
                null
        );
        return feedbackService.getFeedback(userId);
    }

    /**
     * 异常演示接口
     * @return {@link Response}
     * @throws Exception
     */
    @ResponseBody
    @GetMapping("exception")
    Response exception() throws Exception{
        throw  new Exception("Welcome!");
    }

}
