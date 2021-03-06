package com.passbook.advice;

import com.passbook.vo.ErrorInfo;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/*
* 全局异常处理
* 注解@ControllerAdvice后，spring会扫描
* */
@ControllerAdvice
public class GlobalExceptionHandler {
    @ResponseBody
    @ExceptionHandler(value = Exception.class)
    public ErrorInfo<String> errorHandler(HttpServletRequest request, Exception e){
        ErrorInfo<String>info = new ErrorInfo<>();
        info.setCode(ErrorInfo.ERROR);
        info.setMessage(e.getMessage());
        info.setData("DO NOT HAVE RETURN DATA");
        info.setUrl(request.getRequestURI().toString());
        return info;

    }
}
