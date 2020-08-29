package com.campus.entity;

import java.util.Date;
import java.util.List;

/**
 * 商品实体类
 * @Author hyong
 * @Date 2020/8/26 - 17:01
 */
public class Product {
    //id
    private Long productId;
    //商品名称
    private String productName;
    //商品描述
    private String productDesc;
    //商品图片
    private String imgAddr;
    //原件(因为这里的价格不用来计价，只用来展示，所以用String来处理方便些)
    private String normalPrice;
    //折扣价
    private String promotionPrice;
    //权重
    private Integer priority;
    //创建时间
    private Date creatTime;
    //修改时间
    private Date lastEditTime;
    //状态 0：下架 1：可购买
    private Integer enableStatus;
    //商品详情图片列表
    private List<ProductImg> productImgList;
    //商品类型
    private ProductCategory productCategory;
    //商品所属店铺
    private Shop shop;

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductDesc() {
        return productDesc;
    }

    public void setProductDesc(String productDesc) {
        this.productDesc = productDesc;
    }

    public String getImgAddr() {
        return imgAddr;
    }

    public void setImgAddr(String imgAddr) {
        this.imgAddr = imgAddr;
    }

    public String getNormalPrice() {
        return normalPrice;
    }

    public void setNormalPrice(String normalPrice) {
        this.normalPrice = normalPrice;
    }

    public String getPromotionPrice() {
        return promotionPrice;
    }

    public void setPromotionPrice(String promotionPrice) {
        this.promotionPrice = promotionPrice;
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

    public Date getLastEditTime() {
        return lastEditTime;
    }

    public void setLastEditTime(Date lastEditTime) {
        this.lastEditTime = lastEditTime;
    }

    public Integer getEnableStatus() {
        return enableStatus;
    }

    public void setEnableStatus(Integer enableStatus) {
        this.enableStatus = enableStatus;
    }

    public List<ProductImg> getProductImgList() {
        return productImgList;
    }

    public void setProductImgList(List<ProductImg> productImgList) {
        this.productImgList = productImgList;
    }

    public ProductCategory getProductCategory() {
        return productCategory;
    }

    public void setProductCategory(ProductCategory productCategory) {
        this.productCategory = productCategory;
    }

    public Shop getShop() {
        return shop;
    }

    public void setShop(Shop shop) {
        this.shop = shop;
    }
}
