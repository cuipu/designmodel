package com.designmodel.demo.chainofresponsibility;

/**
 * @program: designmodel
 * @className: ConcreteHandler1
 * @Description:
 * @author: Mr.Cui
 * @Date: 2020/9/26 22:08
 */
public class ConcreteHandler1 extends Handler{
    @Override
    public void handleRequest(String request) {
        if ("one".equals(request)){
            System.out.println("具体处理者1负责处理该请求！");
        }else {
            if (getNext() != null){
                getNext().handleRequest(request);
            }else {
                System.out.println("没有人处理该请求！");
            }
        }
    }
}
