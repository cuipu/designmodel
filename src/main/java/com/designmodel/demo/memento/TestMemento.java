package com.designmodel.demo.memento;

/**
 * @program: designmodel
 * @className: TestMemento
 * @Description: 备忘录（Memento）模式的定义：在不破坏封装性的前提下，捕获一个对象的内部状态，并在该对象之外保存这个状态，以便以后当需要时能将该对象恢复到原先保存的状态。该模式又叫快照模式。
 * <p>
 * 备忘录模式是一种对象行为型模式，其主要优点如下。
 * 提供了一种可以恢复状态的机制。当用户需要时能够比较方便地将数据恢复到某个历史的状态。
 * 实现了内部状态的封装。除了创建它的发起人之外，其他对象都不能够访问这些状态信息。
 * 简化了发起人类。发起人不需要管理和保存其内部状态的各个备份，所有状态信息都保存在备忘录中，并由管理者进行管理，这符合单一职责原则。
 * <p>
 * 其主要缺点是：资源消耗大。如果要保存的内部状态信息过多或者特别频繁，将会占用比较大的内存资源。
 * <p>
 * 模式的结构与实现
 * 备忘录模式的核心是设计备忘录类以及用于管理备忘录的管理者类，现在我们来学习其结构与实现。
 * 1. 模式的结构
 * 备忘录模式的主要角色如下。
 * 发起人（Originator）角色：记录当前时刻的内部状态信息，提供创建备忘录和恢复备忘录数据的功能，实现其他业务功能，它可以访问备忘录里的所有信息。
 * 备忘录（Memento）角色：负责存储发起人的内部状态，在需要的时候提供这些内部状态给发起人。
 * 管理者（Caretaker）角色：对备忘录进行管理，提供保存与获取备忘录的功能，但其不能对备忘录的内容进行访问与修改。
 *
 * 方便实现 Undo 和 Redo 操作。命令模式可以与后面介绍的备忘录模式结合，实现命令的撤销与恢复。
 *
 * 
 * 个人认知：
 *  全局变量可以拓展为任意类，或者集合什么的，state只是个实例
 *  memento只是负责保存状态，起中间作用
 *  Originator创建完状态后必须要保存状态才可以恢复
 *
 * @author: Mr.Cui
 * @Date: 2020/9/7 20:58
 */
public class TestMemento {

    public static void main(String[] args) {
        Originator originator = new Originator();
        Caretaker caretaker = new Caretaker();

        originator.setState("1");
        System.out.println("初始状态:" + originator.getState());

        //保存状态
        caretaker.setMemento(originator.createMemento());
        originator.setState("2");
        System.out.println("新的状态:" + originator.getState());

        //恢复状态
        originator.restoreMemento(caretaker.getMemento());
        System.out.println("恢复状态:" + originator.getState());

    }
}
