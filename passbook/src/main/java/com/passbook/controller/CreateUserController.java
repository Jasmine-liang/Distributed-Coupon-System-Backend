package com.passbook.controller;
/*
* 创建用户服务
* */

import com.passbook.log.LogConstans;
import com.passbook.log.LogGenerator;
import com.passbook.service.IUserService;
import com.passbook.vo.Response;
import com.passbook.vo.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

@Slf4j
@RestController
@RequestMapping("/passbook")
public class CreateUserController {
    /*创建用户服务*/
    @Autowired
    private IUserService userService;

    /*HttpServletRequest */
    @Autowired
    private HttpServletRequest httpServletRequest;

    public CreateUserController(IUserService userService, HttpServletRequest httpServletRequest) {
        this.userService = userService;
        this.httpServletRequest = httpServletRequest;
    }

    /**
     * 创建用户
     * @param user {@link User}
     * @return {@link Response}
     * @throws Exception
     */
    @ResponseBody
    @PostMapping("/createuser")
    Response createUser(@RequestBody User user) throws Exception
    {
        LogGenerator.genLog(
                httpServletRequest,
                -1L,
                LogConstans.ActionName.CREATE_FEEDBACK,
                user
        );
        return userService.createUser(user);
    }
}
