package com.hhseong.security.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/admin")
@Controller
public class AdminController {

    @GetMapping("/login")
    public String loginForm(){
        System.out.println("어드민 로그인 성공");
        return "/admin/success";
    }
}
