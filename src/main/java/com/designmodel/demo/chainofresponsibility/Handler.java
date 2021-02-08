package com.designmodel.demo.chainofresponsibility;

/**
 * @program: designmodel
 * @className: Handler
 * @Description: 抽象处理者角色
 * @author: Mr.Cui
 * @Date: 2020/9/26 22:06
 */
public abstract class Handler {

    private Handler next;

    public Handler getNext() {
        return next;
    }

    public void setNext(Handler next) {
        this.next = next;
    }

    /**
     * 处理请求的方法
     * @param request
     */
    public abstract void handleRequest(String request);
}
