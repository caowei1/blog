package com.cw.blog.mapper;

import com.cw.blog.eneity.Blog;
import com.github.pagehelper.PageInfo;
import org.apache.ibatis.annotations.Mapper;

import java.util.ArrayList;
import java.util.List;

@Mapper
public interface BlogMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Blog record);

//    int insertSelective(Blog record);

    Blog selectByPrimaryKey(Integer id);

//    int updateByPrimaryKeySelective(Blog record);

    int updateByPrimaryKey(Blog record);

    List<Blog> getBlogs(Blog blog);

    ArrayList<Blog> getBlogs1(Blog blog);
}