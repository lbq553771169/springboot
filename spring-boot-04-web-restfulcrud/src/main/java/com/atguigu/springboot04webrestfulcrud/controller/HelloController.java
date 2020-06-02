package com.atguigu.springboot04webrestfulcrud.controller;

import com.atguigu.springboot04webrestfulcrud.exception.UserNotExistException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloController {

    @RequestMapping("/hello")
    public void hello(@RequestParam("user") String user) {
        if (user.equals("aa")) {
            throw new UserNotExistException();
        }

    }

}
