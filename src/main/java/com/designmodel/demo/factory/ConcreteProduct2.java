package com.designmodel.demo.factory;

/**
 * @program: designmodel
 * @className: ConcreteProduct2
 * @Description: 具体产品2：实现抽象产品中的抽象方法
 * @author: Mr.Cui
 * @Date: 2020/8/18 22:11
 */
public class ConcreteProduct2 implements Product {
    @Override
    public void show() {
        System.out.println("具体产品2显示...");
    }
}
