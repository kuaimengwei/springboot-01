package com.atguigu.springboot.service.impl;

import com.atguigu.springboot.dao.PostMapper;
import com.atguigu.springboot.pojo.PostWithBLOBs;
import com.atguigu.springboot.service.PostService;
import org.springframework.stereotype.Service;

/**
 * @Description
 * @Author KuaiMengWei
 * @Version V1.0.0
 * @Date 2022/8/9
 */
@Service
public class PostServiceImlp implements PostService {

    private final PostMapper postMapper;
    //构造器注入
    public PostServiceImlp(PostMapper postMapper){
        this.postMapper = postMapper;
    }

    @Override
    public PostWithBLOBs selectByPrimaryKey(Integer pid) {
        PostWithBLOBs postWithBLOBs = postMapper.selectByPrimaryKey(pid);
        System.out.println("PostServiceImlp-->selectByPrimaryKey");
        return postWithBLOBs;
    }


    private Long countByExample (){
        return null;
    }
}
