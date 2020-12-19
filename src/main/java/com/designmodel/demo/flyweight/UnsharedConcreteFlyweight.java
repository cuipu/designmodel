package com.designmodel.demo.flyweight;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @program: designmodel
 * @className: UnsharedConcreteFlyweight
 * @Description: 非享元角色
 * @author: Mr.Cui
 * @Date: 2020/8/30 22:46
 */
@Data
@NoArgsConstructor
//@AllArgsConstructor
public class UnsharedConcreteFlyweight {

    private String info;

    UnsharedConcreteFlyweight(String info)
    {
        this.info=info;
    }

}
