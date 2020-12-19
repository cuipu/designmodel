package com.designmodel.demo.observer;

/**
 * @program: designmodel
 * @className: ConcreteObserver1
 * @Description:
 * @author: Mr.Cui
 * @Date: 2020/9/8 23:13
 */
public class ConcreteObserver1 implements Observer {
    @Override
    public void response() {
        System.out.println("具体观察者1作出反应！");
    }
}
