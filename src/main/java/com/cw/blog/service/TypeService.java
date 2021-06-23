package com.cw.blog.service;

import com.cw.blog.eneity.Type;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface TypeService {
    int deleteTypeByPrimaryKey(Integer id);

    int insertType(Type record);

//    int insertSelective(Type record);

    Type selectTypeByPrimaryKey(Integer id);

//    int updateTypeByPrimaryKeySelective(Type record);

   int updateByPrimaryKey(Type record);

   List<Type> getAllType();

   PageInfo<Type> getTypes(int page,int pageSize);

   Type getTypeByName(String name);
}
