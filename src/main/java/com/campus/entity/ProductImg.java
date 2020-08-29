package com.campus.entity;

import java.util.Date;

/**
 * 商品图片实体类
 * @Author hyong
 * @Date 2020/8/26 - 16:46
 */
public class ProductImg {
    //id
    private long productImgId;
    //图片地址
    private String imgAddr;
    //图片描述
    private String imgDesc;
    //权重
    private Integer priority;
    //创建时间
    private Date creatTime;
    //商品id
    private Long productId;

    public long getProductImgId() {
        return productImgId;
    }

    public void setProductImgId(long productImgId) {
        this.productImgId = productImgId;
    }

    public String getImgAddr() {
        return imgAddr;
    }

    public void setImgAddr(String imgAddr) {
        this.imgAddr = imgAddr;
    }

    public String getImgDesc() {
        return imgDesc;
    }

    public void setImgDesc(String imgDesc) {
        this.imgDesc = imgDesc;
    }

    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    public Date getCreatTime() {
        return creatTime;
    }

    public void setCreatTime(Date creatTime) {
        this.creatTime = creatTime;
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }
}
