package com.designmodel.demo.strategy;

/**
 * @program: designmodel
 * @className: ConcreteStrategyB
 * @Description: 具体策略类B
 * @author: Mr.Cui
 * @Date: 2020/9/3 22:12
 */
public class ConcreteStrategyB implements Strategy{
    @Override
    public void strategyMethod() {
        System.out.println("具体策略B的策略方法被访问！");
    }
}
