package com.atguigu.springboot04webrestfulcrud.controller;

import com.atguigu.springboot04webrestfulcrud.exception.UserNotExistException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

@ControllerAdvice
public class MyExceptionHandler {

    //@ResponseBody
    //@ExceptionHandler(UserNotExistException.class)
    //public Map<String, Object> hadlerException(Exception e) {
    //    Map<String, Object> map = new HashMap<>();
    //    map.put("code", "user.notexist");
    //    map.put("message", e.getMessage());
    //    return map;
    //}

    //@ExceptionHandler(UserNotExistException.class)
    //public String hadlerException(Exception e, HttpServletRequest request) {
    //    Map<String, Object> map = new HashMap<>();
    //    request.setAttribute(RequestDispatcher.ERROR_STATUS_CODE, 500);
    //    // 数据带不过去
    //    map.put("code", "user.notexist");
    //    map.put("message", e.getMessage());
    //    return "forward:/error";
    //}
}
