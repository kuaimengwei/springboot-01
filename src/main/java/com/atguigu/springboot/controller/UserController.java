package com.atguigu.springboot.controller;

import io.swagger.annotations.Api;
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

  //  private final


    //    @GetMapping("/getUsers")
//    public PageInfo<User> getUsers(Integer pid){
//        // pageNum:当前页，pageSize:每页的显示的数据数目
//        PageHelper.startPage(1,5);
//        List<User> list = postService.selectByPrimaryKey(pid);
//        // 上面两行代码必须在一起，设置.startPage()方法后立即查询数据
//        PageInfo<User> pageInfo = new PageInfo<>(list);
//        // 获得分页后的数据信息
//        return pageInfo;
//    }
}
