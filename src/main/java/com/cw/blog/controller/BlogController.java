package com.cw.blog.controller;
import com.cw.blog.eneity.*;
import com.cw.blog.service.BlogService;
import com.cw.blog.service.TagService;
import com.cw.blog.service.TypeService;
import com.cw.blog.service.UserService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/admin")
public class BlogController {

    @Autowired
    private BlogService blogService;
    @Autowired
    private TypeService typeService;
    @Autowired
    private UserService userService;
    @Autowired
    private TagService tagService;

    @GetMapping("/blogs")
    public CommonResult getBlogs(@RequestParam int page,@RequestParam int pageSize, @RequestBody Blog blog){
        ArrayList<Blog> blogs = blogService.getBlogs1(blog);
        for(Blog b :blogs){
          int typeId = b.getTypeId();
          int userId = b.getUserId();
          int blogId = b.getId();
          Type type = typeService.selectTypeByPrimaryKey(typeId);
          User user = userService.getUserById(userId);
          List<Tag> tags = tagService.getTagListById(blogId);
          b.setUser(user);
          b.setType(type);
          b.setTags(tags);
       }
        PageHelper.startPage(page, pageSize);
        PageInfo<Blog> list = new PageInfo<>(blogs);
        return new CommonResult(200,"查询博客成功",list);
    }

    @PostMapping("/insertBlog")
    public CommonResult insertBlog(@RequestBody Blog blog, HttpSession session){
        blog.setUserId((Integer)session.getAttribute("userId"));
        blogService.insertBlog(blog);
        return new CommonResult(200,"成功新增博客",null);
    }

    @PostMapping("/updateBlog")
    public CommonResult updateBlog(@RequestBody Blog blog){
        blogService.updateBlogByPrimaryKey(blog);
        return new CommonResult(200,"成功编辑博客",null);
    }

    @PostMapping("/deleteBlog")
    public CommonResult deleteBlog(@RequestParam int id){
        blogService.deleteBlogByPrimaryKey(id);
        return new CommonResult(200,"成功删除博客",null);
    }

    @GetMapping("/getBlogById")
    public CommonResult getBlogById(@RequestParam int id){
        Blog blog1 = blogService.selectBlogByPrimaryKey(id);
        return new CommonResult(200,"根据id查询博客",blog1);
    }
}
