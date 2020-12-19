package com.designmodel.demo.composite;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @program: designmodel
 * @className: Leaf
 * @Description: 树叶构件（透明方式）
 * @author: Mr.Cui
 * @Date: 2020/8/31 23:30
 */
@Data
@NoArgsConstructor
public class Leaf implements Component{

    private String name;

    public Leaf(String name)
    {
        this.name=name;
    }

    @Override
    public void add(Component c) {

    }

    @Override
    public void remove(Component c) {

    }

    @Override
    public Component getChild(int i) {
        return null;
    }

    @Override
    public void operation() {
        System.out.println("树叶"+name+"：被访问！");
    }
}
