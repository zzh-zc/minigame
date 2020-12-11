package com.f4.minigame.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by zzh on nn
 */
@Controller
@CrossOrigin
@RequestMapping("/f4")
public class loginController {

    @GetMapping("/login.do")
    public ModelAndView login(){

        return null;
    }

    @RequestMapping("/index.do")
    public String index(){
        return "index/login/login";
    }
}
