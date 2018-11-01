package com.imooc.demo1;

import org.springframework.stereotype.Repository;

/**
 * @Author: dtvikey
 * @Date: 18-11-1 下午3:33
 * @Version 1.0
 */
@Repository("userDao")
public class UserDao {
    public void save(){
        System.out.println("save user in DAO");
    }
}
