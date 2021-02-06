package com.designmodel.demo.strategy;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

/**
 * @program: designmodel
 * @className: ConcreteStrategyB
 * @Description: 具体策略类B
 * @author: Mr.Cui
 * @Date: 2020/9/3 22:12
 */
@Service
@Primary
public class ConcreteStrategyB implements Strategy{
    @Override
    public void strategyMethod() {
        System.out.println("具体策略B的策略方法被访问！");
    }
}
