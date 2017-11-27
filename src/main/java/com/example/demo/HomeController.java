package com.example.demo;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String index(){
        return "index";
    }

    @RequestMapping("/page2")
    public String index2(){
        return "page2";
    }

    @RequestMapping("/page3")
    public String index3(){
        return "page3";
    }

}
