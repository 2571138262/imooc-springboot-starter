package com.imooc.controller;

import com.imooc.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Date;

@Controller
@RequestMapping("/th")
public class ThymeleafController {

    @RequestMapping("/index")
    public String index(ModelMap map){
        map.addAttribute("name", "thymeleaf-imooc");
        return "thymeleaf/index";
    }

    @RequestMapping("/center")
    public String center(){
        return "thymeleaf/center/center";
    }

    @RequestMapping("/test")
    public String test(ModelMap map){

        User u = new User();
        u.setName("LeeCX");
        u.setAge(18);
        u.setPassword("123456");
        u.setBirthday(new Date());
        u.setDesc("<font color='green'><b>hello</b></font>");

        map.addAttribute("user", u);

        User u1 = new User();
        u1.setAge(19);
        u1.setName("imooc");
        u1.setPassword("123456");
        u1.setBirthday(new Date());

        map.addAttribute("user1",u1);

        return "thymeleaf/test";
    }

    @RequestMapping("/postform")
    public String postform(User u){
        System.out.println(u.getName());

        return "redirect:/th/test";
    }

    @RequestMapping("/showerror")
    public String showerror(User u){
        int a = 1 / 0;
        return "redirect:/th/test";
    }

}
