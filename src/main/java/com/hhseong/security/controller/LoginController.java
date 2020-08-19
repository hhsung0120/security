package com.hhseong.security.controller;

import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@RequestMapping("/login")
@Controller
public class LoginController {

    @GetMapping("/form")
    public String loginForm(){
        System.out.println("유저 로그인 폼");
        return "/login/form";
    }

    @GetMapping("/success")
    public ModelAndView loginSuccess(Authentication auth){
        ModelAndView mav = new ModelAndView("/login/success");
        System.out.println("Authentication 안에 해당 로그인 사용자 정보 담겨 있음");
        System.out.println("유저 로그인 성공");
        return mav;
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

    @GetMapping("/denied")
    public String loginDenied(){
        return "/login/denied";
    }
}
