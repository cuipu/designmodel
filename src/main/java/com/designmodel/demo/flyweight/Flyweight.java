package com.designmodel.demo.flyweight;

/**
 * @program: designmodel
 * @className: Flyweight
 * @Description: 抽象享元角色
 * @author: Mr.Cui
 * @Date: 2020/8/30 22:45
 */
public interface Flyweight {

    public void operation(UnsharedConcreteFlyweight state);
}
