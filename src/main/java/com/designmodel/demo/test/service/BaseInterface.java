package com.designmodel.demo.test.service;

/**
 * @program: designmodel
 * @className: TestInterface
 * @Description:
 * @author: Mr.Cui
 * @Date: 2021/2/6 20:52
 */
public interface BaseInterface<T>{
    T getT(String jsonStr);

}
