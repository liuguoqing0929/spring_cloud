package com.lgq.login.controller;

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
        return "login success";
    }
}
