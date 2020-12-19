package com.designmodel.demo.builder;

/**
 * @program: designmodel
 * @className: Director
 * @Description: 指挥者（Director）：它调用建造者对象中的部件构造与装配方法完成复杂对象的创建，在指挥者中不涉及具体产品的信息。
 * @author: Mr.Cui
 * @Date: 2020/8/20 22:13
 */
public class Director {
    private Builder builder;
    public Director(Builder builder){
        this.builder = builder;
    }

    /**
     * @Description: 产品构建与组装方法
     * @param: null
     * @return:
     * @Author: Mr.Cui
     * @Date: 2020/8/20 22:15
     */
    public Product construct(){
        builder.buildPartA();
        builder.buildPartB();
        builder.buildPartB();
        return builder.getResult();
    }
}
