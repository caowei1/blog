package com.cw.blog.service;

import com.cw.blog.eneity.Blog;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public interface BlogService {
    int deleteBlogByPrimaryKey(Integer id);

    int insertBlog(Blog record);

//    int insertSelective(Blog record);

    Blog selectBlogByPrimaryKey(Integer id);

//    int updateByPrimaryKeySelective(Blog record);

    int updateBlogByPrimaryKey(Blog record);

    PageInfo<Blog> getBlogs(int page ,int pageSize,Blog blog);

    ArrayList<Blog> getBlogs1(Blog blog);
}
