package com.cw.blog.eneity;

import java.io.Serializable;
import java.util.List;



/**
 * t_tag
 * @author 
 */

public class Tag implements Serializable {
    /**
     * 主键id
     */
    private Integer id;

    /**
     * 标签名字
     */
    private String name;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Tag() {
    }

    public Tag(Integer id, String name, List<Blog> blogs) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Tag{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    private static final long serialVersionUID = 1L;
}