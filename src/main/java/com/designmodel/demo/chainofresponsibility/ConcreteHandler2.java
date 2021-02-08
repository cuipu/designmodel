package com.designmodel.demo.chainofresponsibility;

/**
 * @program: designmodel
 * @className: ConcreteHandler2
 * @Description:
 * @author: Mr.Cui
 * @Date: 2020/9/26 22:09
 */
public class ConcreteHandler2 extends Handler{
    @Override
    public void handleRequest(String request) {
        if ("two".equals(request)){
            System.out.println("具体处理者2负责处理该请求！");
        }else {
            if (getNext() != null){
                getNext().handleRequest(request);
            }else {
                System.out.println("没有人处理该请求！");
            }
        }

    }
}
