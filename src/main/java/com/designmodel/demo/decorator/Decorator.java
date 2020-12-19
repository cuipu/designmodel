package com.designmodel.demo.decorator;

/**
 * @program: designmodel
 * @className: Decorator
 * @Description: 装饰抽象类，继承了 Component， 从外类来扩展 Component 类的功能，但对于 Component 来说，是无需知道 Decorator 的存在的。
 * @author: Mr.Cui
 * @Date: 2020/8/13 21:53
 */
public class Decorator implements Component {

    // 维护一个 Component 对象，和 Component 形成聚合关系
    protected Component component;

    public Decorator(Component component) {
        this.component = component;
    }

    // 调用要修饰对象的原方法
    @Override
    public void operation() {
        System.out.println("基础装饰者");
    }
}
