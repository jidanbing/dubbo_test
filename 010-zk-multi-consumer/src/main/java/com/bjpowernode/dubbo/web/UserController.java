package com.bjpowernode.dubbo.web;

import com.bjpowernode.dubbo.model.User;
import com.bjpowernode.dubbo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    private UserService userService2;

    @RequestMapping("/user")
    public String queryUserById(Model model,Integer id){
        User user1 = userService.queryUserById(id);
        model.addAttribute("user1",user1);

        User user2 = userService2.queryUserById(id);
        model.addAttribute("user2",user2);
        return "userDetail";
    }
}
