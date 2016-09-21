package com.kingfy.blog.entity;

import java.util.Date;

/**
 * 用户实体类
 * @author ljf
 */
public class User {

    private long userId;
    private String userName;
    private long userPhone;
    private int score;
    private Date createTime;
    private Date lastLoginTime;
    private String address;

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public long getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(long userPhone) {
        this.userPhone = userPhone;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getLastLoginTime() {
        return lastLoginTime;
    }

    public void setLastLoginTime(Date lastLoginTime) {
        this.lastLoginTime = lastLoginTime;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", userPhone=" + userPhone +
                ", score=" + score +
                ", createTime=" + createTime +
                ", lastLoginTime=" + lastLoginTime +
                ", address='" + address + '\'' +
                '}';
    }
}
