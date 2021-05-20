package com.lgq.order.controller;

import com.lgq.feign.interfaces.LoginFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * ClassName TestController
 * Description TODO
 *
 * @Author LGQ
 * @Date 2021/5/20 14:11
 * @Version 1.0
 **/
@RestController
public class TestController {

    @Autowired
    private LoginFeign loginFeign;

    @GetMapping("login")
    public String testFeignLogin(){
        return loginFeign.login();
    }
}
