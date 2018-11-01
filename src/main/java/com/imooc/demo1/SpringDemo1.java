package com.imooc.demo1;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author: dtvikey
 * @Date: 18-11-1 下午3:21
 * @Version 1.0
 */
public class SpringDemo1 {

    @Test
    public void demo1(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserService userService = (UserService) applicationContext.getBean("userService");
        String s =  userService.sayHello("fjw");
        System.out.println(s);
    }

}
