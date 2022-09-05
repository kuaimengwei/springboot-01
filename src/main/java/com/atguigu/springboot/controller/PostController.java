package com.atguigu.springboot.controller;

import com.atguigu.springboot.pojo.PostWithBLOBs;
import com.atguigu.springboot.service.PostService;
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

@Api(tags = "PostControllera")
@RequestMapping("/post")
@RestController
public class PostController {

    //构造器注入
    private final PostService postService;
    public PostController(PostService postService) {
        this.postService = postService;
    }

    @GetMapping("/selectByPrimaryKey")
    public PostWithBLOBs selectByPrimaryKey(Integer pid){
        return postService.selectByPrimaryKey(pid);
    }

}
