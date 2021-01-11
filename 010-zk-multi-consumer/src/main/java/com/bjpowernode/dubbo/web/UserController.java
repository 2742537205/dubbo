package com.bjpowernode.dubbo.web;

import com.bjpowernode.dubbo.model.User;
import com.bjpowernode.dubbo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * ClassName:UserController
 * Package:com.bjpowernode.dubbo.web
 * Description:
 *
 * @date:2020/3/3 11:01
 * @author:蛙课网
 */
@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    private UserService userService2;

    @RequestMapping(value = "/userDetail")
    public String userDetail(Model model,Integer id,String username) {

        User user = userService.queryUserById(id, username);

        User user2 = userService2.queryUserById(id,username);

        model.addAttribute("user",user);
        model.addAttribute("user2",user2);

        return "userDetail";
    }

    @RequestMapping(value = "/userDetail2")
    public String userDetail2(Model model,Integer id,String username) {
        User user = userService2.queryUserById(id, username);
        model.addAttribute("user",user);
        return "userDetail";
    }

    @RequestMapping(value = "/userDetail3")
    public String userDetail3(Model model,Integer id,String username) {
        User user = userService.queryUserById(id, username);
        model.addAttribute("user",user);
        return "userDetail";
    }
}
