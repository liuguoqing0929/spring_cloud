package com.lgq.feign.interfaces;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
/*  */
@FeignClient("login-server")
public interface LoginFeign {

    @PostMapping("login")
    public String login();
}
