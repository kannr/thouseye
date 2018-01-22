package com.thouseye.model;

/**
 * 评论
 */
public class Comment {

    /**
     * 评论id
     */
    private long id;

    /**
     * 评论对象id
     */
    private long itemid;

    /**
     * 评论人用户id
     */
    private long userid;

    /**
     * 评论人头像
     */
    private String avatar;

    /**
     * 评论人昵称
     */
    private String nickname;

    /**
     * 评论内容
     */
    private String content;

    /**
     * 评论时间
     */
    private String commenttime;

    /**
     * 评论状态
     * 1表示正常
     * 2表示已删除
     */
    private int status;

    /**
     * 被回复的评论id
     */
    private Long commentedid;

    /**
     * 被回复的评论内容
     */
    private String commentedContent;

    /**
     * 被回复的评论人id
     */
    private long commentedUserid;

    /**
     * 被回复的评论人头像
     */
    private String commentedAvatar;

    /**
     * 被回复的评论人昵称
     */
    private String commentedNickname;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getItemid() {
        return itemid;
    }

    public void setItemid(long itemid) {
        this.itemid = itemid;
    }

    public long getUserid() {
        return userid;
    }

    public void setUserid(long userid) {
        this.userid = userid;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getCommenttime() {
        return commenttime;
    }

    public void setCommenttime(String commenttime) {
        this.commenttime = commenttime;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public Long getCommentedid() {
        return commentedid;
    }

    public void setCommentedid(Long commentedid) {
        this.commentedid = commentedid;
    }

    public String getCommentedContent() {
        return commentedContent;
    }

    public void setCommentedContent(String commentedContent) {
        this.commentedContent = commentedContent;
    }

    public long getCommentedUserid() {
        return commentedUserid;
    }

    public void setCommentedUserid(long commentedUserid) {
        this.commentedUserid = commentedUserid;
    }

    public String getCommentedAvatar() {
        return commentedAvatar;
    }

    public void setCommentedAvatar(String commentedAvatar) {
        this.commentedAvatar = commentedAvatar;
    }

    public String getCommentedNickname() {
        return commentedNickname;
    }

    public void setCommentedNickname(String commentedNickname) {
        this.commentedNickname = commentedNickname;
    }
}
