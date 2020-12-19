package com.designmodel.demo.adapter;

/**
 * @program: designmodel
 * @className: ObjectAdapter
 * @Description: 对象适配器类
 * @author: Mr.Cui
 * @Date: 2020/8/17 22:14
 */
public class ObjectAdapter implements Target{

    private Adaptee adaptee;
    public ObjectAdapter(Adaptee adaptee){
        this.adaptee = adaptee;
    }

    @Override
    public void request() {
        adaptee.specificRequest();
    }
}
