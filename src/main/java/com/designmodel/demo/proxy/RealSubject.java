package com.designmodel.demo.proxy;

/**
 * @program: designmodel
 * @className: RealSubject
 * @Description: 真实主题
 * @author: Mr.Cui
 * @Date: 2020/8/24 22:00
 */
public class RealSubject implements Subject {
    @Override
    public void Request() {
        System.out.println("访问真实主题方法...");
    }
}
