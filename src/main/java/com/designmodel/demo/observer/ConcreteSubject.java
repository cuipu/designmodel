package com.designmodel.demo.observer;

/**
 * @program: designmodel
 * @className: ConcreteSubject
 * @Description:
 * @author: Mr.Cui
 * @Date: 2020/9/8 23:15
 */
public class ConcreteSubject extends Subject{

    /**
     * 实现通知方法，遍历观察者集合，调用观察者反应方法
     */
    @Override
    public void notifyObserver() {
        System.out.println("具体目标发生改变...");
        System.out.println("--------------");

        for (Observer observer : observers) {
            observer.response();
        }

    }
}
