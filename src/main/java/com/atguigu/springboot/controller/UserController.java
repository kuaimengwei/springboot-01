package com.atguigu.springboot.controller;

import com.atguigu.springboot.pojo.User;
import com.atguigu.springboot.service.UserService;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description
 * @Author KuaiMengWei
 * @Version V1.0.0
 * @Date 2022/9/5
 */

@Api(tags = "UserControllera")
@RequestMapping("/user")
@RestController
public class UserController {

   private final UserService userService;
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/selectByPrimaryKey")
    public User selectByPrimaryKey(Integer uid){
        User user = userService.selectByPrimaryKey(uid);
        return user;
    }


}
