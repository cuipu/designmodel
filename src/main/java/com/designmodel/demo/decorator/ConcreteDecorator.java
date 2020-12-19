package com.designmodel.demo.decorator;

/**
 * @program: designmodel
 * @className: ConcerateDecorator
 * @Description: 真正的装饰者类，继承装饰者类并且提供增强方法，多态的应用，父类引用指向字类对象
 *
 * @author: Mr.Cui
 * @Date: 2020/8/13 21:55
 */
public class ConcreteDecorator extends Decorator {

    public ConcreteDecorator(Component component) {
        super(component);
        this.enhancementMethod1();
        this.enhancementMethod2();
    }

    public void enhancementMethod1() {
        System.out.println("增强方法1");
    }

    public void enhancementMethod2() {
        System.out.println("增强方法2");
    }
}
