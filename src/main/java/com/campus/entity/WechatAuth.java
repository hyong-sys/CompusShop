package com.campus.entity;

import java.util.Date;

/**
 * 微信账号实体类
 * @Author hyong
 * @Date 2020/8/25 - 20:35
 */
public class WechatAuth {
    //id
    private Long wechatAuthId;
    //微信与公众号唯一标识
    private String openId;
    //创建时间
    private Date createTime;
    //用于关联用户的userId
    private PersonInfo personInfo;

    public Long getWechatAuthId() {
        return wechatAuthId;
    }

    public void setWechatAuthId(Long wechatAuthId) {
        this.wechatAuthId = wechatAuthId;
    }

    public String getOpenId() {
        return openId;
    }

    public void setOpenId(String openId) {
        this.openId = openId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public PersonInfo getPersonInfo() {
        return personInfo;
    }

    public void setPersonInfo(PersonInfo personInfo) {
        this.personInfo = personInfo;
    }
}
