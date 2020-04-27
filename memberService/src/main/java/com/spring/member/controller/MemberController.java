package com.spring.member.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/v1")
@RefreshScope
public class MemberController {

    @Value("${server.port}")
    private int port;

    @Value("${spring.message}")
    private String message;

//    @Value("${user.password}")
//    private String password;

    @GetMapping("/member/detail")
    public String member() {
        return "Member Detail - Port " + port + " _ " + message;
    }

    @GetMapping("/pay/detail")
    public String pay() {
        return "Pay Detail - Port " + port + " - " + message;
    }

//    @GetMapping("/member/password")
//    public String memberPassword() {
//        return "Member Password - " + password;
//    }
}
