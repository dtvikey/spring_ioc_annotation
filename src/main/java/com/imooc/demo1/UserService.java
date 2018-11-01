package com.imooc.demo1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @Author: dtvikey
 * @Date: 18-11-1 下午3:18
 * @Version 1.0
 * Spring的Bean管理的注解方式
 * 传统方式需要去xml中配置<bean id="" class=""></bean>
 */

@Service("userService")
public class UserService {

    @Value("米饭")
    private String something;

//    @Autowired
//    @Qualifier("userDao")
    @Resource(name="userDao")
    private UserDao userDao;

    public String sayHello(String name){
        return "Hello "+name;
    }

    public void eat(){
        System.out.println("eat:"+something);
    }

    public void save(){
        System.out.println("save user in service");
        userDao.save();
    }

}
