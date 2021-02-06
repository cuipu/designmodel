package com.designmodel.demo.factory;

/**
 * @program: designmodel
 * @className: ConcreteFactory2
 * @Description:
 * @author: Mr.Cui
 * @Date: 2020/8/18 22:14
 */
public class ConcreteFactory2 implements AbstractFactory {
    @Override
    public Object getT() {
        return null;
    }

    @Override
    public Product newProduct() {
        System.out.println("具体工厂2生成-->具体产品2...");
        return new ConcreteProduct2();
    }
}
