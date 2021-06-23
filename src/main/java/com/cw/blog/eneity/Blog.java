package com.cw.blog.eneity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;


/**
 * t_blog
 * @author 
 */

public class Blog implements Serializable {
    /**
     * 主键id
     */
    private Integer id;

    /**
     * 标题
     */
    private String title;

    /**
     * 内容
     */
    private String content;

    /**
     * 图片地址
     */
    private String picture;

    /**
     * 标记
     */
    private String flag;

    /**
     * 浏览次数
     */
    private Integer views;

    /**
     * 赞赏是否开启 0关 1开
     */
    private Byte appreciation;

    /**
     * 分享是否开启 0关 1开
     */
    private Byte sharestatement;

    /**
     * 评论是否开启 0关 1开
     */
    private Byte commentabled;

    /**
     * 版权是否开启 0关 1开
     */
    private Byte published;

    /**
     * 推荐是否开启 0关 1开
     */
    private Long recommend;

    /**
     * 创建时间
     */
    private Date createtime;

    /**
     * 更新时间
     */
    private Date updatetime;


    private int typeId;

    private List<Tag> tags;

    private int userId;

    private List<Comment> comments;

    private Type type;

    private User user;

    private int tagId;

    public int getTagId() {
        return tagId;
    }

    public void setTagId(int tagId) {
        this.tagId = tagId;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }

    public Integer getViews() {
        return views;
    }

    public void setViews(Integer views) {
        this.views = views;
    }

    public Byte getAppreciation() {
        return appreciation;
    }

    public void setAppreciation(Byte appreciation) {
        this.appreciation = appreciation;
    }

    public Byte getSharestatement() {
        return sharestatement;
    }

    public void setSharestatement(Byte sharestatement) {
        this.sharestatement = sharestatement;
    }

    public Byte getCommentabled() {
        return commentabled;
    }

    public void setCommentabled(Byte commentabled) {
        this.commentabled = commentabled;
    }

    public Byte getPublished() {
        return published;
    }

    public void setPublished(Byte published) {
        this.published = published;
    }

    public Long getRecommend() {
        return recommend;
    }

    public void setRecommend(Long recommend) {
        this.recommend = recommend;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Date getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }

    public int getTypeId() {
        return typeId;
    }

    public void setTypeId(int typeId) {
        this.typeId = typeId;
    }

    public List<Tag> getTags() {
        return tags;
    }

    public void setTags(List<Tag> tags) {
        this.tags = tags;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public List<Comment> getComments() {
        return comments;
    }

    public void setComments(List<Comment> comments) {
        this.comments = comments;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Blog() {
    }

    public Blog(Integer id, String title, String content, String picture, String flag, Integer views, Byte appreciation, Byte sharestatement, Byte commentabled, Byte published, Long recommend, Date createtime, Date updatetime, int typeId, List<Tag> tags, int userId, List<Comment> comments) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.picture = picture;
        this.flag = flag;
        this.views = views;
        this.appreciation = appreciation;
        this.sharestatement = sharestatement;
        this.commentabled = commentabled;
        this.published = published;
        this.recommend = recommend;
        this.createtime = createtime;
        this.updatetime = updatetime;
        this.typeId = typeId;
        this.tags = tags;
        this.userId = userId;
        this.comments = comments;
    }

    @Override
    public String toString() {
        return "Blog{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", picture='" + picture + '\'' +
                ", flag='" + flag + '\'' +
                ", views=" + views +
                ", appreciation=" + appreciation +
                ", sharestatement=" + sharestatement +
                ", commentabled=" + commentabled +
                ", published=" + published +
                ", recommend=" + recommend +
                ", createtime=" + createtime +
                ", updatetime=" + updatetime +
                ", typeId=" + typeId +
                ", tags=" + tags +
                ", userId=" + userId +
                ", comments=" + comments +
                '}';
    }

    private static final long serialVersionUID = 1L;
}