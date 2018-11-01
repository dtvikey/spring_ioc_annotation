package com.imooc.demo2;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @Author: dtvikey
 * @Date: 18-11-1 下午3:46
 * @Version 1.0
 */
@Component("bean1")
public class Bean1 {

    @PostConstruct
    public void init(){
        System.out.println("initBean...");
    }


    public void say(){
        System.out.println("say...");
    }

    @PreDestroy
    public void destory(){
        System.out.println("destoryBean...");
    }
}
