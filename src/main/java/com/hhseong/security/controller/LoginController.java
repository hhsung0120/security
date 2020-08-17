package com.hhseong.security.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/login")
@Controller
public class LoginController {

    @GetMapping("/form")
    public String loginForm(){
        System.out.println("유저 로그인 폼 입니다.");
        return "/login/form";
    }

    @GetMapping("/fail")
    public String loginFail(){
        return "/login/fail";
    }

}
