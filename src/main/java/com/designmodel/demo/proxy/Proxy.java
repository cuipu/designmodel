package com.designmodel.demo.proxy;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @program: designmodel
 * @className: Proxy
 * @Description: 代理
 * @author: Mr.Cui
 * @Date: 2020/8/24 22:00
 */
@Data // getter setter toString
@NoArgsConstructor // 空参构造
//@AllArgsConstructor // 全参构造
public class Proxy implements Subject{

    /**
     * 内部维护一个真实主题
     */
    private RealSubject realSubject;

    public Proxy(RealSubject realSubject){
        this.realSubject = realSubject;
    }
    @Override
    public void Request() {
        if (realSubject == null){
            realSubject = new RealSubject();
        }
        this.beforeRequset();
        realSubject.Request();
        this.afterRequset();
    }

    public void beforeRequset(){
        System.out.println("访问真实主题之前的预处理");
    }

    public void afterRequset(){
        System.out.println("访问真实主题之后的预处理");
    }
}
