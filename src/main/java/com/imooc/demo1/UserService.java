package com.imooc.demo1;

import org.springframework.stereotype.Component;

/**
 * @Author: dtvikey
 * @Date: 18-11-1 下午3:18
 * @Version 1.0
 * Spring的Bean管理的注解方式
 * 传统方式需要去xml中配置<bean id="" class=""></bean>
 */

@Component("userService")
public class UserService {
    public String sayHello(String name){
        return "Hello "+name;
    }
}
