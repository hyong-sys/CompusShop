package com.campus.test.service;

import com.campus.entity.Area;
import com.campus.service.AreaService;
import com.campus.test.BestTest;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @Author: hyong
 * @Date: 2020/8/30 9:22 下午
 * @Description:
 */
public class AreaServiceTest extends BestTest {
    @Autowired
    private AreaService areaService;
    @Test
    public void testQueryArea(){
        List<Area> areaList = areaService.queryArea();
        System.out.println(areaList.get(0).getAreaName());
    }
}
