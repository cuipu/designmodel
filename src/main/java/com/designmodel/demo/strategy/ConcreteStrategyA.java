package com.designmodel.demo.strategy;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Service;

/**
 * @program: designmodel
 * @className: ConcreteStrategyA
 * @Description: 具体策略类A
 * @author: Mr.Cui
 * @Date: 2020/9/3 22:12
 */
@Service
@ConditionalOnProperty(prefix = "keyten",name = "isTianJin",havingValue = "true",matchIfMissing = false)
public class ConcreteStrategyA implements Strategy{

    @Override
    public void strategyMethod() {
        System.out.println("具体策略A的策略方法被访问！");
    }
}
