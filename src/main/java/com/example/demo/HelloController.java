package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {

    @Value("${custName}")
    private String userName;

    @Value("${bookTitle}")
    private String bookTitle;

    @RequestMapping(value="/hello",produces = "text/plain;charset=UTF-8")
    public String index(ModelMap map) {
        // 加入一个属性，用来在模板中读取
        map.addAttribute("userName", userName);
        map.addAttribute("bookTitle", bookTitle);
        // return模板文件的名称，对应src/main/resources/templates/welcome.html
        return "welcome";
    }
}