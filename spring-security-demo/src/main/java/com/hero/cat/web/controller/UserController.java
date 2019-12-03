package com.hero.cat.web.controller;


import com.hero.cat.web.dto.User;
import com.hero.cat.exception.UserNotExistException;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {

    @RequestMapping("/test1")
    @ResponseBody
    public Object test1(){
        System.out.println("test1 ---> do");
        return "abc";
    }


    @GetMapping("/{id:\\d+}")
    public User getInfo(@PathVariable String id) {
		throw new UserNotExistException("user not exist");
//        System.out.println("进入getInfo服务");
//        User user = new User();
//        user.setUsername("tom");
//        return user;
    }




}
