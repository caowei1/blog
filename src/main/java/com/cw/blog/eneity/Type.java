package com.cw.blog.eneity;

import java.io.Serializable;


/**
 * t_type
 * @author 
 */

public class Type implements Serializable {
    /**
     * 主键id
     */
    private Integer id;

    /**
     * 分类名称
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

    public Type() {
    }

    public Type(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Type{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    private static final long serialVersionUID = 1L;
}