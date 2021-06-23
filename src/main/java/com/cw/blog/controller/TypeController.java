package com.cw.blog.controller;

import com.cw.blog.eneity.CommonResult;
import com.cw.blog.eneity.Type;
import com.cw.blog.service.TypeService;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/admin")
public class TypeController {

    @Autowired
    private TypeService typeService;

    @GetMapping("/types")
    public CommonResult<PageInfo<Type>> getTypes(@RequestParam int page, @RequestParam int pageSize){
        PageInfo<Type> types = typeService.getTypes(page,pageSize);
        return new CommonResult<>(200,"成功查询所有类型",types);
    }

    @PostMapping("/insertType")
    public CommonResult insertType(@RequestBody Type type){
        Type type1 = typeService.getTypeByName(type.getName());
        if(type1 != null){
            return new CommonResult(200,"该类型已存在",null);
        }else {
            typeService.insertType(type);
            return new CommonResult(200,"插入成功",null);
        }
    }

    @PostMapping("/updateType")
    public CommonResult updateType(@RequestBody Type type){
        typeService.updateByPrimaryKey(type);
        return new CommonResult(200,"更新成功",null);
    }

    @PostMapping("/deleteType")
    public CommonResult deleteType(@RequestParam int id){
        typeService.deleteTypeByPrimaryKey(id);
        return new CommonResult(200,"删除成功",null);
    }

    @PostMapping("/getTypeById")
    public CommonResult getTypeById(@RequestParam int id){
        Type type = typeService.selectTypeByPrimaryKey(id);
        return new CommonResult(200,"查询成功",type);
    }
}
