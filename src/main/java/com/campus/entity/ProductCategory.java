package com.campus.entity;

import java.util.Date;

/**
 * 商品类别实体类
 * @Author hyong
 * @Date 2020/8/26 - 16:22
 */
public class ProductCategory {
    //id
    private Long productCategoryId;
    /*店铺id(不适用引用类型的店铺id是因为该id只需要对应到相对应的店铺，
     而不需要取出关于店铺的其他msg,所以采用基本类型)*/
    private Long shopId;
    //商品类别名称
    private String productCategoryName;
    //权重
    private Integer priority;
    //创建时间
    private Date createTime;

    public Long getProductCategoryId() {
        return productCategoryId;
    }

    public void setProductCategoryId(Long productCategoryId) {
        this.productCategoryId = productCategoryId;
    }

    public Long getShopId() {
        return shopId;
    }

    public void setShopId(Long shopId) {
        this.shopId = shopId;
    }

    public String getProductCategoryName() {
        return productCategoryName;
    }

    public void setProductCategoryName(String productCategoryName) {
        this.productCategoryName = productCategoryName;
    }

    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}
