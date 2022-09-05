package com.atguigu.springboot.service;


import com.atguigu.springboot.pojo.User;
import org.springframework.stereotype.Service;

/**
 * @Description
 * @Author KuaiMengWei
 * @Version V1.0.0
 * @Date 2022/9/5
 */
@Service
public interface UserService {

    User selectByPrimaryKey(Integer uid);

}
