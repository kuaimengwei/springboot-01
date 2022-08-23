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
 * @Date 2022/8/9
 */
@Api(tags = "swagger测试api")
@RequestMapping("/test")
@RestController
public class TestController {

    private final PostService postService;
    //构造器注入
    public TestController(PostService postService){
        this.postService = postService;
    }

//    @GetMapping("/getUsers")
//    public PageInfo<User> getUsers(){
//        // pageNum:当前页，pageSize:每页的显示的数据数目
//        PageHelper.startPage(1,5);
//        List<User> list = testService.selectAllExample();
//        // 上面两行代码必须在一起，设置.startPage()方法后立即查询数据
//        PageInfo<User> pageInfo = new PageInfo<>(list);
//        // 获得分页后的数据信息
//        return pageInfo;
//    }

    @GetMapping("/selectByPrimaryKey")
    public PostWithBLOBs selectByPrimaryKey(Integer pid){
        return postService.selectByPrimaryKey(pid);
    }

}
