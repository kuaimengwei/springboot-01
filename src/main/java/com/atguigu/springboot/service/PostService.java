package com.atguigu.springboot.service;

import com.atguigu.springboot.pojo.PostWithBLOBs;
import org.springframework.stereotype.Service;


/**
 * @Description
 * @Author KuaiMengWei
 * @Version V1.0.0
 * @Date 2022/8/8
 */
@Service
public interface PostService {


    PostWithBLOBs selectByPrimaryKey(Integer pid);

}
