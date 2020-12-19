package com.designmodel.demo.decorator;

/**
 * @program: designmodel
 * @className: ConcreteComponent
 * @Description: 基础具体构建角色
 * @author: Mr.Cui
 * @Date: 2020/8/13 21:52
 */
public class ConcreteComponent implements Component {

    @Override
    public void operation() {
        System.out.println("基本操作");
    }
}
