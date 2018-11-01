package com.imooc.demo3;

import javax.annotation.Resource;

/**
 * @Author: dtvikey
 * @Date: 18-11-1 下午4:01
 * @Version 1.0
 */
public class ProductService {

    @Resource(name = "categoryDao")
    private CategoryDao categoryDao;

    @Resource(name = "productDao")
    private ProductDao productDao;


//    public void setCategoryDao(CategoryDao categoryDao) {
//        this.categoryDao = categoryDao;
//    }
//
//    public void setProductDao(ProductDao productDao) {
//        this.productDao = productDao;
//    }

    public void save(){
        System.out.println("save method in ProductService doing...");
        categoryDao.save();
        productDao.save();
    }
}
