package com.designmodel.demo.builder;

/**
 * @program: designmodel
 * @className: Builder
 * @Description: 抽象建造者：包含创建产品各个子部件的抽象方法。
 * @author: Mr.Cui
 * @Date: 2020/8/20 22:09
 */
public abstract class Builder {
    /**
     * 创建产品对象
     */
    protected Product product=new Product();

    public abstract void buildPartA();

    public abstract void buildPartB();

    public abstract void buildPartC();

    /**
     * 返回产品对象
     * @return 返回组装好的对象
     */
    public Product getResult()
    {
        return product;
    }
}
