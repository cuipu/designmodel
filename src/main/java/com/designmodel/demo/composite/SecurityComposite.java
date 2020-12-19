package com.designmodel.demo.composite;

import java.util.ArrayList;

/**
 * @program: designmodel
 * @className: SecurityComposite
 * @Description:
 * @author: Mr.Cui
 * @Date: 2020/8/31 23:40
 */
public class SecurityComposite implements SecurityComponent {
    private ArrayList<SecurityComponent> children = new ArrayList<SecurityComponent>();

    public void add(SecurityComponent c) {
        children.add(c);
    }

    public void remove(SecurityComponent c) {
        children.remove(c);
    }

    public SecurityComponent getChild(int i) {
        return children.get(i);
    }

    @Override
    public void operation() {
        for (SecurityComponent child : children) {
            child.operation();
        }
    }
}
