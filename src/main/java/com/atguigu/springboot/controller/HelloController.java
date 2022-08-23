package com.atguigu.springboot.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description
 * @Author KuaiMengWei
 * @Version V1.0.0
 * @Date 2022/8/4
 */
@Api(tags = "swagger测试hello")
@RestController
public class HelloController {
    @RequestMapping("/hello")
    @ApiOperation(value = "swagger文档测试接口", notes = "测试Hello")
    public String handle01(){
        return "Hello,SpringBoot2!";
    }



}
