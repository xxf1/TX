package com.txsk.test;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.alibaba.fastjson.JSON;
import com.txsk.model.User;
import com.txsk.service.UserService;

@RunWith(SpringJUnit4ClassRunner.class)     //琛ㄧず缁ф壙浜哠pringJUnit4ClassRunner绫�  
@ContextConfiguration(locations = {"classpath:spring-mybatis.xml"})  
public class TestMybatis {
	private static Logger logger = Logger.getLogger(TestMybatis.class);  
	
	@Resource  
    private UserService userService = null; 
	
	@Test  
    public void test1() {  
        User user = userService.selectByPrimaryKey(2);  
       // System.out.println(user.getUsername());  
        // logger.info("鍊硷細"+user.getUserName()); 
        logger.info(JSON.toJSONString(user));  
}
}