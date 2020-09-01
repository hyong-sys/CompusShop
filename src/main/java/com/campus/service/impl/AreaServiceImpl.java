package com.campus.service.impl;

import com.campus.dao.AreaDao;
import com.campus.entity.Area;
import com.campus.service.AreaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: hyong
 * @Date: 2020/8/30 9:13 下午
 * @Description:
 */
@Service
public class AreaServiceImpl implements AreaService {
    @Autowired
    private AreaDao areaDao;
    @Override
    public List<Area> queryArea() {

        return areaDao.queryArea();
    }
}
