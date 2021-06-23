package com.cw.blog.service.Impl;

import com.cw.blog.eneity.Tag;
import com.cw.blog.eneity.Type;
import com.cw.blog.mapper.TagMapper;
import com.cw.blog.service.TagService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class TagServiceImpl implements TagService {

    @Autowired
    private TagMapper tagMapper;

    @Transactional
    @Override
    public int deleteTagByPrimaryKey(Integer id) {
        return tagMapper.deleteByPrimaryKey(id);
    }

    @Transactional
    @Override
    public int insertTag(Tag tag) {
        return tagMapper.insert(tag);
    }

    @Transactional
    @Override
    public Tag selectTagByPrimaryKey(Integer id) {
        return tagMapper.selectByPrimaryKey(id);
    }

    @Transactional
    @Override
    public int updateTagByPrimaryKey(Tag tag) {
        return tagMapper.updateByPrimaryKey(tag);
    }

    @Transactional
    @Override
    public PageInfo<Tag> getTags(int page,int pageSize) {
        PageHelper.startPage(page,pageSize);
        List<Tag> list = tagMapper.getTags();
        PageInfo<Tag> pageInfo = new PageInfo<Tag>(list);
        return pageInfo;
    }

    @Transactional
    @Override
    public Tag getTagByName(String name) {
        return tagMapper.getTagByName(name);
    }

    @Override
    public List<Tag> getTagListById(int id) {
        return tagMapper.selectTagListById(id);
    }
}
