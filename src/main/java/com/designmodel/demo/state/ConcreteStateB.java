package com.designmodel.demo.state;

/**
 * @program: designmodel
 * @className: ConcreteStateB
 * @Description: 具体状态B类
 * @author: Mr.Cui
 * @Date: 2020/10/7 21:47
 */
public class ConcreteStateB extends State{
    @Override
    public void Handle(Context context) {
        System.out.println("当前状态是 B.");
        context.setState(new ConcreteStateA());
    }
}
