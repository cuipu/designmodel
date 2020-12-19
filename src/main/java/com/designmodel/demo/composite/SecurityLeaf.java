package com.designmodel.demo.composite;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @program: designmodel
 * @className: SecurityLeaf
 * @Description:
 * @author: Mr.Cui
 * @Date: 2020/8/31 23:39
 */
@Data
@NoArgsConstructor
public class SecurityLeaf implements SecurityComponent{

    private String name;

    public SecurityLeaf(String name) {
        this.name = name;
    }

    @Override
    public void operation() {
        System.out.println("安全树叶"+name+"：被访问！");
    }
}
