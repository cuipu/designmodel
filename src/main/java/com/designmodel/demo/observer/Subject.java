package com.designmodel.demo.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: designmodel
 * @className: Subject
 * @Description: 抽象目标
 * @author: Mr.Cui
 * @Date: 2020/9/8 23:11
 */
public abstract class Subject {

    /**
     * 内部维护一个抽象观察这的集合
     */
    protected List<Observer> observers=new ArrayList<Observer>();

    /**
     * 增加观察者方法
     * @param observer
     */
    public void add(Observer observer)
    {
        observers.add(observer);
    }

    /**
     * 删除观察者方法
     * @param observer
     */
    public void remove(Observer observer)
    {
        observers.remove(observer);
    }

    /**
     * 通知观察者方法
     */
    public abstract void notifyObserver();
}
