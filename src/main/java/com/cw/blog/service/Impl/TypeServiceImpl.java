package com.cw.blog.service.Impl;

import com.cw.blog.eneity.Type;
import com.cw.blog.mapper.TypeMapper;
import com.cw.blog.service.TypeService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class TypeServiceImpl implements TypeService {

    @Autowired
    private TypeMapper typeMapper;

    @Transactional
    @Override
    public int deleteTypeByPrimaryKey(Integer id) {
        return typeMapper.deleteByPrimaryKey(id);
    }

    @Transactional
    @Override
    public int insertType(Type record) {
        return typeMapper.insert(record);
    }

    @Transactional
    @Override
    public Type selectTypeByPrimaryKey(Integer id) {
        return typeMapper.selectByPrimaryKey(id);
    }

    @Transactional
    @Override
    public int updateByPrimaryKey(Type record) {
        return typeMapper.updateByPrimaryKey(record);
    }

    @Override
    public List<Type> getAllType() {
        return typeMapper.findAllType();
    }

    @Override
    public PageInfo<Type> getTypes(int page,int pageSize) {
        PageHelper.startPage(page, pageSize);
        List<Type> list = typeMapper.findAllType();
        PageInfo<Type> pageInfo = new PageInfo<>(list);
        return pageInfo;
    }

    @Override
    public Type getTypeByName(String name) {
        return typeMapper.getTypeByName(name);
    }


}
