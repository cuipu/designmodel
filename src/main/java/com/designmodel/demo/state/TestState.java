package com.designmodel.demo.state;

/**
 * @program: designmodel
 * @className: TestState
 * @Description:
 * 状态模式的定义与特点
 * 状态（State）模式的定义：对有状态的对象，把复杂的“判断逻辑”提取到不同的状态对象中，允许状态对象在其内部状态发生改变时改变其行为。
 *
 * 状态模式是一种对象行为型模式，其主要优点如下。
 * 状态模式将与特定状态相关的行为局部化到一个状态中，并且将不同状态的行为分割开来，满足“单一职责原则”。
 * 减少对象间的相互依赖。将不同的状态引入独立的对象中会使得状态转换变得更加明确，且减少对象间的相互依赖。
 * 有利于程序的扩展。通过定义新的子类很容易地增加新的状态和转换。
 *
 * 状态模式的主要缺点如下。
 * 状态模式的使用必然会增加系统的类与对象的个数。
 * 状态模式的结构与实现都较为复杂，如果使用不当会导致程序结构和代码的混乱。
 * 状态模式的结构与实现
 * 状态模式把受环境改变的对象行为包装在不同的状态对象里，其意图是让一个对象在其内部状态改变的时候，其行为也随之改变。现在我们来分析其基本结构和实现方法。
 * 1. 模式的结构
 * 状态模式包含以下主要角色。
 * 环境（Context）角色：也称为上下文，它定义了客户感兴趣的接口，维护一个当前状态，并将与状态相关的操作委托给当前状态对象来处理。
 * 抽象状态（State）角色：定义一个接口，用以封装环境对象中的特定状态所对应的行为。
 * 具体状态（Concrete    State）角色：实现抽象状态所对应的行为。
 *
 * http://c.biancheng.net/view/1388.html
 * @author: Mr.Cui
 * @Date: 2020/10/7 21:40
 */
public class TestState {

    public static void main(String[] args) {
        Context context = new Context();
        //State stateA = new ConcreteStateA();
        //State stateB = new ConcreteStateB();

        //context.setState(stateA);
        context.Handle();
        context.Handle();
        context.Handle();
        context.Handle();
    }
}
