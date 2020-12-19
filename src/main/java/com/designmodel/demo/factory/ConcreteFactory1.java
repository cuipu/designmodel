package com.designmodel.demo.factory;

/**
 * @program: designmodel
 * @className: ConcreteFactory1
 * @Description: 具体工厂1：实现了厂品的生成方法
 * @author: Mr.Cui
 * @Date: 2020/8/18 22:13
 */
public class ConcreteFactory1 implements AbstractFactory{

    @Override
    public Product newProduct() {
        System.out.println("具体工厂1生成-->具体产品1...");
        return new ConcreteProduct1();
    }
}
