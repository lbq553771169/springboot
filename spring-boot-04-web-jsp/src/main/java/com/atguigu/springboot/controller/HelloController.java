package com.atguigu.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;

/**
 * @author liubaoqiang
 * @date 06/03/2020 2:30 PM
 * @className HelloController
 * @description TODO
 **/
@Controller
public class HelloController {


    @GetMapping("/toSuccess")
    public String toSuc(Model model) {
        model.addAttribute("message", "hello");
        return "success";
    }
}
