package com.designmodel.demo.factory;

/**
 * @program: designmodel
 * @className: ConcreteProduct1
 * @Description: 具体产品1：实现抽象产品中的抽象方法
 * @author: Mr.Cui
 * @Date: 2020/8/18 22:11
 */
public class ConcreteProduct1 implements Product {
    @Override
    public void show() {
        System.out.println("具体产品1显示...");
    }
}
