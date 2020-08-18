package com.hhseong.security.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/login")
@Controller
public class LoginController {

    @GetMapping("/form")
    public String loginForm(){
        System.out.println("유저 로그인 폼");
        return "/login/form";
    }

    @GetMapping("/success")
    public String loginSuccess(){
        System.out.println("유저 로그인 성공");
        return "/login/success";
    }

    @GetMapping("/logout")
    public String logout(){
        System.out.println("유저 로그아웃 성공");
        return "/login/logout";
    }

    @GetMapping("/fail")
    public String loginFail(){
        return "/login/fail";
    }

}
