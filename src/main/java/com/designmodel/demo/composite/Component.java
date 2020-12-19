package com.designmodel.demo.composite;

/**
 * @program: designmodel
 * @className: Component
 * @Description: 抽象构件
 * @author: Mr.Cui
 * @Date: 2020/8/31 23:29
 */
public interface Component {

    public void add(Component c);
    public void remove(Component c);
    public Component getChild(int i);
    public void operation();

}
