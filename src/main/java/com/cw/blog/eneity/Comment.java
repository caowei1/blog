package com.cw.blog.eneity;

import java.io.Serializable;
import java.util.Date;


/**
 * t_comment
 * @author 
 */

public class Comment implements Serializable {
    /**
     * 主键id
     */
    private Integer id;

    /**
     * 昵称
     */
    private String nickname;

    /**
     * 邮箱
     */
    private String email;

    /**
     * 内容
     */
    private String content;

    /**
     * 头像地址
     */
    private String avatar;

    /**
     * 创建地址
     */
    private Date createtime;

    private Blog blog;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Blog getBlog() {
        return blog;
    }

    public void setBlog(Blog blog) {
        this.blog = blog;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Comment() {
    }

    public Comment(Integer id, String nickname, String email, String content, String avatar, Date createtime, Blog blog) {
        this.id = id;
        this.nickname = nickname;
        this.email = email;
        this.content = content;
        this.avatar = avatar;
        this.createtime = createtime;
        this.blog = blog;
    }

    @Override
    public String toString() {
        return "Comment{" +
                "id=" + id +
                ", nickname='" + nickname + '\'' +
                ", email='" + email + '\'' +
                ", content='" + content + '\'' +
                ", avatar='" + avatar + '\'' +
                ", createtime=" + createtime +
                ", blog=" + blog +
                '}';
    }

    private static final long serialVersionUID = 1L;
}