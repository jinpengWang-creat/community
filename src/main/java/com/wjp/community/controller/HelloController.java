package com.wjp.community.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author 王锦鹏
 * @version 1.8
 * @date 2021/7/19
 */
@Controller
public class HelloController {
    @GetMapping("/hello")
    public String hello(@RequestParam(value = "name",required = false) String name){
        return "hello";
    }

    @GetMapping("/greeting")
    public String greeting(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
        model.addAttribute("name", name);
        return "greeting";
    }

}
