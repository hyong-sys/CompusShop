package com.campus.dao;

import com.campus.entity.Shop;

public interface ShopDao {
    /**
     * @Author hyong
     * @Description 添加商铺
     * @Date 2020/8/31
     * @Param [shop]
     * @return int
     **/
    int insertShop(Shop shop);
    /**
     * @Author hyong
     * @Description 更新商铺
     * @Date 2020/8/31
     * @Param [shop]
     * @return int
     **/
    int updateShop(Shop shop);
}
