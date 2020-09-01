package com.campus.test.dao;

import com.campus.dao.ShopDao;
import com.campus.entity.Area;
import com.campus.entity.PersonInfo;
import com.campus.entity.Shop;
import com.campus.entity.ShopCategory;
import com.campus.test.BestTest;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;

/**
 * @Author: hyong
 * @Date: 2020/8/31 4:09 下午
 * @Description:
 */
public class ShopDaoTest extends BestTest {
    @Autowired
    private ShopDao shopDao;
    @Test
    @Ignore
    public void testInsertShop(){
        Shop shop = new Shop();
        Area area = new Area();
        ShopCategory shopCategory = new ShopCategory();
        PersonInfo owner = new PersonInfo();

        area.setAreaId(2);
        shopCategory.setShopCategoryId(1l);
        owner.setUserId(1l);

        shop.setArea(area);
        shop.setShopCategory(shopCategory);
        shop.setOwner(owner);
        shop.setShopName("测试店铺");
        shop.setShopDesc("测试店铺描述");
        shop.setShopAddr("测试店铺地址");
        shop.setPhone("测试店铺电话");
        shop.setShopImg("/Users/hyong/壁纸/4K静态壁纸/46.png");
        shop.setPriority(1);
        shop.setCreateTime(new Date());
        shop.setLastEditTime(new Date());
        shop.setEnableStatus(1);
        shop.setAdvice("测试建议");
//        int effectedNum = shopDao.insertShop(shop);
        System.out.println("测试影响行数insert==========="+shopDao.insertShop(shop));

    }

    @Test
    public void testUpdateShop(){
        Shop shop = new Shop();
        shop.setShopId(1l);
        shop.setLastEditTime(new Date());
        shop.setShopDesc("测试描述desc");
//        int effectedNum = shopDao.insertShop(shop);
        System.out.println("测试影响行数update==========="+shopDao.updateShop(shop));

    }
}
