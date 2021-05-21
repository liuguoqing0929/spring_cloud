package com.lgq.login.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * ClassName LoginController
 * Description TODO
 *
 * @Author LGQ
 * @Date 2021/5/20 14:03
 * @Version 1.0
 **/
@RestController
public class LoginController {


    @PostMapping("login")
    public String login(){
        return "post login success";
    }

    @GetMapping("login")
    public String login2(){
        return "get login success";
    }
}
