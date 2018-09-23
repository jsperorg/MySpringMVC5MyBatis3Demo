package com.ah.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by jianyuchen on 2018/9/20.
 */
@Controller
@RequestMapping("/test")
public class TestController {

    @GetMapping("/hello/{name}")
    public String hello(@PathVariable("name") String name,Model model){
        model.addAttribute("name",name);

        System.out.println(name);

        return "index";
    }
}
