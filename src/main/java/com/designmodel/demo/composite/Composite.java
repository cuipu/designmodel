package com.designmodel.demo.composite;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;

/**
 * @program: designmodel
 * @className: Composite
 * @Description: 树枝构件
 * @author: Mr.Cui
 * @Date: 2020/8/31 23:31
 */
@Data
@NoArgsConstructor
public class Composite implements Component{

    private ArrayList<Component> children=new ArrayList<Component>();

    @Override
    public void add(Component c) {
        children.add(c);
    }

    @Override
    public void remove(Component c) {
        children.remove(c);
    }

    @Override
    public Component getChild(int i) {
        return children.get(i);
    }

    @Override
    public void operation() {
        for (Component child : children) {
                child.operation();
        }
    }
}
