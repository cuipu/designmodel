package com.designmodel.demo.bridge;

/**
 * @program: designmodel
 * @className: Abstraction
 * @Description: 抽象化角色
 *
 * 内部维护一个实现化角色（implementor）
 * 定义一个抽象方法
 *
 * @author: Mr.Cui
 * @Date: 2020/8/21 22:20
 */
public abstract class Abstraction {
    protected Implementor implementor;

    protected Abstraction(Implementor implementor){
        this.implementor = implementor;
    }
    public abstract void Operation();
}
