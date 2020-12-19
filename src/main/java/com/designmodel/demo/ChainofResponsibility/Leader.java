package com.designmodel.demo.ChainofResponsibility;

/**
 * @program: designmodel
 * @className: Leader
 * @Description: 抽象处理者：领导类
 * @author: Mr.Cui
 * @Date: 2020/9/26 22:14
 */
public abstract class Leader {

    private Leader next;
    public void setNext(Leader next)
    {
        this.next=next;
    }
    public Leader getNext()
    {
        return next;
    }

    /**
     * 处理请求的方法
     * @param LeaveDays
     */
    public abstract void handleRequest(int LeaveDays);
}
