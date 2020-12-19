package com.designmodel.demo.flyweight;

/**
 * @program: designmodel
 * @className: TestFlyweight
 * @Description: 享元（Flyweight）模式的定义：运用共享技术来有效地支持大量细粒度对象的复用。它通过共享已经存在的对象来大幅度减少需要创建的对象数量、避免大量相似类的开销，从而提高系统资源的利用率。
 *
 * 享元模式的主要优点是：相同对象只要保存一份，这降低了系统中对象的数量，从而降低了系统中细粒度对象给内存带来的压力。
 *
 * 其主要缺点是：
 * 为了使对象可以共享，需要将一些不能共享的状态外部化，这将增加程序的复杂性。
 * 读取享元模式的外部状态会使得运行时间稍微变长。
 *
 * 享元模式中存在以下两种状态：
 * 内部状态，即不会随着环境的改变而改变的可共享部分；
 * 外部状态，指随环境改变而改变的不可以共享的部分。享元模式的实现要领就是区分应用中的这两种状态，并将外部状态外部化。下面来分析其基本结构和实现方法。
 * 1. 模式的结构
 * 享元模式的主要角色有如下。
 * 抽象享元角色（Flyweight）:是所有的具体享元类的基类，为具体享元规范需要实现的公共接口，非享元的外部状态以参数的形式通过方法传入。
 * 具体享元（Concrete Flyweight）角色：实现抽象享元角色中所规定的接口。
 * 非享元（Unsharable Flyweight)角色：是不可以共享的外部状态，它以参数的形式注入具体享元的相关方法中。
 * 享元工厂（Flyweight Factory）角色：负责创建和管理享元角色。当客户对象请求一个享元对象时，享元工厂检査系统中是否存在符合要求的享元对象，如果存在则提供给客户；如果不存在的话，则创建一个新的享元对象。
 *
 * 个人认知：
 *  享元模式就是将公共的部分抽取出来，非公共的部分以参数形式维护，享元工厂维护一个hashmap，key为string，value为享元接口，如果key存在则返回value，key不存在则创建实现类，保证value的单一性，非公共部分则以参数形式创建
 *
 *  理解不是很深刻，需要加强
 *
 * @author: Mr.Cui
 * @Date: 2020/8/30 22:42
 */
public class TestFlyweight {

    public static void main(String[] args) {
        FlyweightFactory flyweightFactory = new FlyweightFactory();

        Flyweight flyweight1 = flyweightFactory.getFlyweight("a");
        Flyweight flyweight2 = flyweightFactory.getFlyweight("a");
        Flyweight flyweight3 = flyweightFactory.getFlyweight("a");
        Flyweight flyweight4 = flyweightFactory.getFlyweight("b");
        Flyweight flyweight5 = flyweightFactory.getFlyweight("b");

        flyweight1.operation(new UnsharedConcreteFlyweight("第一次调用a"));
        flyweight2.operation(new UnsharedConcreteFlyweight("第二次调用a"));
        flyweight3.operation(new UnsharedConcreteFlyweight("第三次调用a"));
        flyweight4.operation(new UnsharedConcreteFlyweight("第一次调用b"));
        flyweight5.operation(new UnsharedConcreteFlyweight("第二次调用b"));
    }
}
