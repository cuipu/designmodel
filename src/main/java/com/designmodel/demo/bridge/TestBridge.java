package com.designmodel.demo.bridge;

/**
 * @program: designmodel
 * @className: TestBridge
 * @Description: 桥接（Bridge）模式的定义如下：将抽象与实现分离，使它们可以独立变化。它是用组合关系代替继承关系来实现，从而降低了抽象和实现这两个可变维度的耦合度。
 *
 * 引申： 在现实生活中，某些类具有两个或多个维度的变化，如图形既可按形状分，又可按颜色分。如何设计类似于 Photoshop 这样的软件，能画不同形状和不同颜色的图形呢？如果用继承方式，m 种形状和 n 种颜色的图形就有 m×n 种，不但对应的子类很多，而且扩展困难。
 *
 * 桥接（Bridge）模式的优点是：
 * 由于抽象与实现分离，所以扩展能力强；
 * 其实现细节对客户透明。
 *
 * 缺点是：由于聚合关系建立在抽象层，要求开发者针对抽象化进行设计与编程，这增加了系统的理解与设计难度。
 *
 * 模式的结构
 * 桥接（Bridge）模式包含以下主要角色。
 * 抽象化（Abstraction）角色：定义抽象类，并包含一个对实现化对象的引用。
 * 扩展抽象化（Refined    Abstraction）角色：是抽象化角色的子类，实现父类中的业务方法，并通过组合关系调用实现化角色中的业务方法。
 * 实现化（Implementor）角色：定义实现化角色的接口，供扩展抽象化角色调用。
 * 具体实现化（Concrete Implementor）角色：给出实现化角色接口的具体实现。
 *
 * 个人认知：
 * 1、定义一个接口，创建多个实现类
 * 2、定义一个抽象类，定义一个接口成员变量，用来内部维护接口，并定义扩展抽象方法（类似一个桥连接接口（接口实现类）和抽象类实现类用来增加扩展方法）
 * 3、定义多个实现类实现抽象类并实现扩展抽象方法，增强拓展能力
 *
 * @author: Mr.Cui
 * @Date: 2020/8/21 22:16
 */
public class TestBridge {

    public static void main(String[] args) {

        Implementor implementorA = new ConcreteImplementorA();
        Implementor implementorB = new ConcreteImplementorB();

        Abstraction abstractionA = new RefinedAbstractionA(implementorA);
        Abstraction abstractionB = new RefinedAbstractionB(implementorB);

        abstractionA.Operation();
        abstractionB.Operation();

        abstractionA.implementor.OperationImpl();
        abstractionB.implementor.OperationImpl();

    }
}
