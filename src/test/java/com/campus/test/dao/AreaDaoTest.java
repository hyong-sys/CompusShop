package com.campus.test.dao;

import com.campus.dao.AreaDao;
import com.campus.entity.Area;
import com.campus.test.BestTest;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @Author: hyong
 * @Date: 2020/8/30 3:01 下午
 * @Description:
 */
public class AreaDaoTest extends BestTest{
    @Autowired
    private AreaDao areaDao;

    @Test
    public void testQueryArea(){
        List<Area> areaList = areaDao.queryArea();
        System.out.println(areaList.size());
        //assertEquals(2,areaList);

    }

}
