package com.designmodel.demo.builder;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @program: designmodel
 * @className: Product
 * @Description: 产品角色：包含多个组成部件的复杂对象。
 * @author: Mr.Cui
 * @Date: 2020/8/20 22:07
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Product {

    private String partA;

    private String partB;

    private String partC;

    public void show()
    {
        //显示产品的特性
        this.toString();
    }
}
