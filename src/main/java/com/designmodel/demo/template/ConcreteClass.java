package com.designmodel.demo.template;

/**
 * @program: designmodel
 * @className: ConcreteClass
 * @Description:
 * @author: Mr.Cui
 * @Date: 2021/2/8 17:47
 */
public class ConcreteClass extends AbstractClass{

    @Override
    public void abstractMethod1() {
        System.out.println("抽象方法1的实现被调用...");
    }

    @Override
    public void abstractMethod2() {
        System.out.println("抽象方法2的实现被调用...");
    }
}
