package com.campus.web.superadmin;

import com.campus.entity.Area;
import com.campus.service.AreaService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author: hyong
 * @Date: 2020/8/30 9:42 下午
 * @Description:
 */
@Controller
@RequestMapping("/superadmin")
public class AreaController {
    Logger logger = LoggerFactory.getLogger(AreaController.class);
    @Autowired
    private AreaService areaService;

    /**
     * @Author hyong
     * @Description
     * @Date 2020/8/31
     * @Param [a]
     * @return java.util.Map<java.lang.String,java.lang.Object>
     **/
    @RequestMapping(value = "/listarea",method = RequestMethod.GET)
    @ResponseBody
    private Map<String,Object> listArea(){
        logger.info("========start========");
        long startTime = System.currentTimeMillis();
        Map<String,Object> modelMap = new HashMap<String,Object>();
        List<Area> list = new ArrayList();
        try{
            list = areaService.queryArea();
            modelMap.put("rows",list);
            modelMap.put("total",list.size());
        }catch (Exception e){
            e.printStackTrace();
            modelMap.put("success",false);
            modelMap.put("errMsg",e.toString());
            logger.error("=======test error========");
        }
        long endTime = System.currentTimeMillis();
        logger.debug("costTime[{}]ms",endTime-startTime);
        logger.info("========start========");
        return modelMap;
    }

}
