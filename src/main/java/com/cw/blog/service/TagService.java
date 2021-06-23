package com.cw.blog.service;

import com.cw.blog.eneity.Tag;
import com.github.pagehelper.PageInfo;
import org.springframework.core.metrics.StartupStep;

import java.util.List;

public interface TagService {

    int deleteTagByPrimaryKey(Integer id);

    int insertTag(Tag record);

//    int insertSelective(Tag record);

    Tag selectTagByPrimaryKey(Integer id);

//    int updateByPrimaryKeyByPrimaryKeySelective(Tag record);

    int updateTagByPrimaryKey(Tag record);

    PageInfo<Tag> getTags(int page,int pageSize);

    Tag getTagByName(String name);

    List<Tag> getTagListById(int id);
}
