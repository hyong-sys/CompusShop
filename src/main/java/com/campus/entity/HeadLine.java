package com.campus.entity;

import java.util.Date;

/**
 * 头条实体类
 * @Author hyong
 * @Date 2020/8/26 - 10:30
 */
public class HeadLine {
    //id
    private Long lineId;
    //头条名称
    private String lineName;
    //跳转链接
    private String lineLink;
    //图片地址
    private String lineImg;
    //权重
    private Integer priority;
    //是否可用 0：不可用 1：可用
    private Integer enableStatus;
    //创建时间
    private Date creatTime;
    //修改时间
    private Date lastEditTime;

    public Long getLineId() {
        return lineId;
    }

    public void setLineId(Long lineId) {
        this.lineId = lineId;
    }

    public String getLineName() {
        return lineName;
    }

    public void setLineName(String lineName) {
        this.lineName = lineName;
    }

    public String getLineLink() {
        return lineLink;
    }

    public void setLineLink(String lineLink) {
        this.lineLink = lineLink;
    }

    public String getLineImg() {
        return lineImg;
    }

    public void setLineImg(String lineImg) {
        this.lineImg = lineImg;
    }

    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    public Integer getEnableStatus() {
        return enableStatus;
    }

    public void setEnableStatus(Integer enableStatus) {
        this.enableStatus = enableStatus;
    }

    public Date getCreatTime() {
        return creatTime;
    }

    public void setCreatTime(Date creatTime) {
        this.creatTime = creatTime;
    }

    public Date getLastEditTime() {
        return lastEditTime;
    }

    public void setLastEditTime(Date lastEditTime) {
        this.lastEditTime = lastEditTime;
    }
}
