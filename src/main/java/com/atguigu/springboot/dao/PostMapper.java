package com.atguigu.springboot.dao;

import com.atguigu.springboot.pojo.Post;
import com.atguigu.springboot.pojo.PostExample;
import com.atguigu.springboot.pojo.PostWithBLOBs;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface PostMapper {
    long countByExample(PostExample example);

    int deleteByExample(PostExample example);

    int deleteByPrimaryKey(Integer pid);

    int insert(PostWithBLOBs record);

    int insertSelective(PostWithBLOBs record);

    List<PostWithBLOBs> selectByExampleWithBLOBs(PostExample example);

    List<Post> selectByExample(PostExample example);

    PostWithBLOBs selectByPrimaryKey(Integer pid);

    int updateByExampleSelective(@Param("record") PostWithBLOBs record, @Param("example") PostExample example);

    int updateByExampleWithBLOBs(@Param("record") PostWithBLOBs record, @Param("example") PostExample example);

    int updateByExample(@Param("record") Post record, @Param("example") PostExample example);

    int updateByPrimaryKeySelective(PostWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(PostWithBLOBs record);

    int updateByPrimaryKey(Post record);
}