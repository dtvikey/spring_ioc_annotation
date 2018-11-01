package com.imooc.demo3;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author: dtvikey
 * @Date: 18-11-1 下午4:13
 * @Version 1.0
 */
public class SpringDemo3 {

    @Test
    public void demo1(){
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        ProductService productService = (ProductService) applicationContext.getBean("productService");
        productService.save();
    }


}
