package com.designmodel.demo.observer;

/**
 * @program: designmodel
 * @className: ConcreteObserver2
 * @Description:
 * @author: Mr.Cui
 * @Date: 2020/9/8 23:13
 */
public class ConcreteObserver2 implements Observer{
    @Override
    public void response() {
        System.out.println("具体观察者2作出反应！");
    }
}
