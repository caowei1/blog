package com.cw.blog.service.Impl;

import com.cw.blog.eneity.Blog;
import com.cw.blog.mapper.BlogMapper;
import com.cw.blog.service.BlogService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BlogServiceImpl implements BlogService {

    @Autowired
    private BlogMapper blogMapper;

    @Override
    public int deleteBlogByPrimaryKey(Integer id) {
        return blogMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insertBlog(Blog record) {
        return blogMapper.insert(record);
    }

    @Override
    public Blog selectBlogByPrimaryKey(Integer id) {
        return blogMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateBlogByPrimaryKey(Blog record) {
        return blogMapper.updateByPrimaryKey(record);
    }

    @Override
    public PageInfo<Blog> getBlogs(int page ,int pageSize,Blog blog) {
        PageHelper.startPage(page,pageSize);
        List<Blog> blogs = blogMapper.getBlogs(blog);
        PageInfo<Blog> list = new PageInfo<Blog>(blogs);
        return list;
  }

    @Override
    public ArrayList<Blog> getBlogs1(Blog blog) {
        return blogMapper.getBlogs1(blog);
    }
}
