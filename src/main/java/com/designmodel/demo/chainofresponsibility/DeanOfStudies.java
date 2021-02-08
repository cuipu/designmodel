package com.designmodel.demo.chainofresponsibility;

/**
 * @program: designmodel
 * @className: DeanOfStudies
 * @Description: 具体处理者4：教务处长类
 * @author: Mr.Cui
 * @Date: 2020/9/26 22:16
 */
public class DeanOfStudies extends Leader{
    @Override
    public void handleRequest(int LeaveDays) {
        if(LeaveDays<=20)
        {
            System.out.println("教务处长批准您请假"+LeaveDays+"天。");
        }
        else
        {
            if(getNext()!=null)
            {
                getNext().handleRequest(LeaveDays);
            }
            else
            {
                System.out.println("请假天数太多，没有人批准该假条！");
            }
        }
    }
}
