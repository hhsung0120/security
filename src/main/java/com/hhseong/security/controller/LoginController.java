package com.hhseong.security.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@RequestMapping("/login")
@Controller
public class LoginController {

    @GetMapping("/form")
    public String loginForm(){
        System.out.println("로그인 폼 입니다.");
        return "login/form";
    }

    @PostMapping("/perform")
    public ModelAndView perform(){
        ModelAndView mav = new ModelAndView("/index");
        System.out.println("여는 타나요");
        return mav;
    }
}
