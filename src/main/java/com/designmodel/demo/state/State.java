package com.designmodel.demo.state;

/**
 * @program: designmodel
 * @className: State
 * @Description: 抽象状态类
 * @author: Mr.Cui
 * @Date: 2020/10/7 21:43
 */
public abstract class State {

    public abstract void Handle(Context context);
}
