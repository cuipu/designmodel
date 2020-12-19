package com.designmodel.demo.decorator;

/**
 * 装饰模式的定义与特点
 * 装饰（Decorator）模式的定义：指在不改变现有对象结构的情况下，动态地给该对象增加一些职责（即增加其额外功能）的模式，它属于对象结构型模式。
 *
 * 装饰（Decorator）模式的主要优点有：
 * 采用装饰模式扩展对象的功能比采用继承方式更加灵活。
 * 可以设计出多个不同的具体装饰类，创造出多个不同行为的组合。
 *
 * 其主要缺点是：装饰模式增加了许多子类，如果过度使用会使程序变得很复杂。
 * 装饰模式的结构与实现
 * 通常情况下，扩展一个类的功能会使用继承方式来实现。但继承具有静态特征，耦合度高，并且随着扩展功能的增多，子类会很膨胀。如果使用组合关系来创建一个包装对象（即装饰对象）来包裹真实对象，并在保持真实对象的类结构不变的前提下，为其提供额外的功能，这就是装饰模式的目标。下面来分析其基本结构和实现方法。
 *
 * 1. 模式的结构
 * 装饰模式主要包含以下角色。
 * 抽象构件（Component）角色：定义一个抽象接口以规范准备接收附加责任的对象。
 * 具体构件（Concrete    Component）角色：实现抽象构件，通过装饰角色为其添加一些职责。
 * 抽象装饰（Decorator）角色：继承抽象构件，并包含具体构件的实例，可以通过其子类扩展具体构件的功能。
 * 具体装饰（ConcreteDecorator）角色：实现抽象装饰的相关方法，并给具体构件对象添加附加的责任。
 *
 * @program: designmodel
 * @className: DecoratorTest
 * @Description: 测试用例
 * @author: Mr.Cui
 * @Date: 2020/8/13 21:57
 */
public class TestDecorator {
    public static void main(String[] args) {
        Component oldComponent = new ConcreteComponent();
        oldComponent.operation();
        System.out.println("----------我是分割线----------");
        Component newComponent = new ConcreteDecorator(oldComponent);
        newComponent.operation();
    }

    /*
    *   File file = new File ("hello.txt");
        FileInputStream in=new FileInputStream(file);
        InputStreamReader inReader=new InputStreamReader(in);
        BufferedReader bufReader=new BufferedReader(inReader);
        可以看出步骤2到3使用的是适配器模式，而3到4使用的是装饰者模式 。

    * */
}
