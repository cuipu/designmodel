package com.designmodel.demo.strategy;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @program: designmodel
 * @className: Context
 * @Description: 环境类
 * @author: Mr.Cui
 * @Date: 2020/9/3 22:13
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Context {

    private Strategy strategy;

    public void strategyMethod()
    {
        strategy.strategyMethod();
    }

}
