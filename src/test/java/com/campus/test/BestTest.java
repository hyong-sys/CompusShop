package com.campus.test;

import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @Author: hyong
 * @Date: 2020/8/30 2:56 下午
 * @Description:配置Spring和juint整合，juint启动时加载springIOC容器
 */
@RunWith(SpringJUnit4ClassRunner.class)
//告诉juint spring配置文件的位置
@ContextConfiguration({"classpath:spring/spring-dao.xml","classpath:spring/spring-service.xml"})
public class BestTest {

}
