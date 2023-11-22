package com.example.g_project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {
    @GetMapping({"/", "/index"})
    public String loadMain(){
        return "index";
    }

    @GetMapping("/home")
    public String home(){
        return "home";
    }

    @GetMapping("/timer")
    public String timer(){
        return "timer";
    }
    @GetMapping("/mypage")
    public String mypage(){
        return "mymy";
    }

    @GetMapping("/findId")
    public String findId(){
        return "find_id";
    }
    @GetMapping("/findPw")
    public String findPw(){
        return "find_pwd";
    }

}
