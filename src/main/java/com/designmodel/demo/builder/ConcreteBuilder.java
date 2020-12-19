package com.designmodel.demo.builder;

/**
 * @program: designmodel
 * @className: ConcreteBuilder
 * @Description: 具体建造者(Concrete Builder）：实现 Builder 接口，完成复杂产品的各个部件的具体创建方法。
 * @author: Mr.Cui
 * @Date: 2020/8/20 22:11
 */
public class ConcreteBuilder extends Builder{
    @Override
    public void buildPartA() {
        super.product.setPartA("建造 PartA");
    }

    @Override
    public void buildPartB() {
        super.product.setPartB("建造 PartB");
    }

    @Override
    public void buildPartC() {
        super.product.setPartC("建造 PartC");
    }
}
