package com.websystique.springmvc.controller;

import com.websystique.springmvc.user;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import static org.graalvm.compiler.options.OptionType.User;

@Controller
public class UserController {
    @RequestMapping("/")
    public <User> ModelAndView sendMessage() {
        user user= new user();
        user.setUserName("nishi");
        ModelAndView modelAndView= new ModelAndView("index");
        modelAndView.addObject("message",user.getUserName()+" Welcome to Stackroute");
        return modelAndView;
    }



}
