package com.designmodel.demo.state;

/**
 * @program: designmodel
 * @className: ConcreteStateA
 * @Description: 具体状态A类
 * @author: Mr.Cui
 * @Date: 2020/10/7 21:44
 */
public class ConcreteStateA extends State{
    @Override
    public void Handle(Context context) {
        System.out.println("当前状态是 A.");
        context.setState(new ConcreteStateB());
    }
}
