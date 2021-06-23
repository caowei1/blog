package com.cw.blog.controller;

import com.cw.blog.eneity.CommonResult;
import com.cw.blog.eneity.Tag;
import com.cw.blog.service.TagService;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/admin")
public class TagController {

    @Autowired
    private TagService tagService;

    @GetMapping("/tags")
    public CommonResult<PageInfo<Tag>> getTags(@RequestParam int page,@RequestParam int pageSize){
        PageInfo<Tag> list = tagService.getTags(page,pageSize);
        return new CommonResult(200,"查询标签成功",list);
    }

    @PostMapping("/insertTag")
    public CommonResult insertTag(@RequestBody Tag tag){
        Tag tag1 = tagService.getTagByName(tag.getName());
        if(tag1 != null){
            return new CommonResult(200,"已存在此标签",null);
        }else {
            tagService.insertTag(tag);
            return new CommonResult(200,"成功插入标签",null);
        }
    }

    @PostMapping("/updateTag")
    public CommonResult updateTag(@RequestBody Tag tag){
        tagService.updateTagByPrimaryKey(tag);
        return  new CommonResult(200,"成功修改标签",null);
    }

    @PostMapping("/deleteTag")
    public CommonResult deleteTag(@RequestParam int id){
        tagService.deleteTagByPrimaryKey(id);
        return  new CommonResult(200,"成功删除标签",null);
    }

    @GetMapping("/getTagById")
    public CommonResult getTagById(@RequestParam int id){
       Tag tag =  tagService.selectTagByPrimaryKey(id);
        return  new CommonResult(200,"成功根据id查询标签",tag);
    }
}
