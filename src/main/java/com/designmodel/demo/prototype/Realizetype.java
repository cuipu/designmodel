package com.designmodel.demo.prototype;

/**
 * @program: designmodel
 * @className: Realizetype
 * @Description:
 * @author: Mr.Cui
 * @Date: 2020/8/25 21:49
 */
public class Realizetype implements Cloneable{

    public Realizetype(){
        System.out.println("具体原型创建成功！");
    }
    @Override
    public Object clone() throws CloneNotSupportedException {
        System.out.println("具体原型复制成功！");
        return (Realizetype)super.clone();
    }
}
