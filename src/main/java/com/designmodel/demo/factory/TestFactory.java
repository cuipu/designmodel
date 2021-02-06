package com.designmodel.demo.factory;

/**
 * @program: designmodel
 * @className: TestFactory
 * @Description: 工厂方法（FactoryMethod）模式的定义：定义一个创建产品对象的工厂接口，将产品对象的实际创建工作推迟到具体子工厂类当中。这满足创建型模式中所要求的“创建与使用相分离”的特点。
 *
 * 工厂方法模式的主要优点有：
 * 用户只需要知道具体工厂的名称就可得到所要的产品，无须知道产品的具体创建过程；
 * 在系统增加新的产品时只需要添加具体产品类和对应的具体工厂类，无须对原工厂进行任何修改，满足开闭原则；
 *
 * 其缺点是：每增加一个产品就要增加一个具体产品类和一个对应的具体工厂类，这增加了系统的复杂度。
 *
 * 模式的结构
 * 工厂方法模式的主要角色如下。
 * 抽象工厂（Abstract Factory）：提供了创建产品的接口，调用者通过它访问具体工厂的工厂方法 newProduct() 来创建产品。
 * 具体工厂（ConcreteFactory）：主要是实现抽象工厂中的抽象方法，完成具体产品的创建。
 * 抽象产品（Product）：定义了产品的规范，描述了产品的主要特性和功能。
 * 具体产品（ConcreteProduct）：实现了抽象产品角色所定义的接口，由具体工厂来创建，它同具体工厂之间一一对应。
 *
 * 个人认知：还是利用米安翔对象的三大特性：继承、封装、多态
 * 多态： 父类引用指向子类对象
 * @author: Mr.Cui
 * @Date: 2020/8/18 22:08
 */
public class TestFactory {
    public static void main(String[] args) {
        AbstractFactory concreteFactory1 = new ConcreteFactory1();

        Product product1 = concreteFactory1.newProduct();

        AbstractFactory concreteFactory2 = new ConcreteFactory2();
        Product product2 = concreteFactory2.newProduct();

        product1.show();
        product2.show();
    }
}
