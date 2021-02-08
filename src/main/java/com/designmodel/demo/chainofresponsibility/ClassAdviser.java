package com.designmodel.demo.chainofresponsibility;

/**
 * @program: designmodel
 * @className: ClassAdviser
 * @Description: 具体处理者1：班主任类
 * @author: Mr.Cui
 * @Date: 2020/9/26 22:15
 */
public class ClassAdviser extends Leader{
    @Override
    public void handleRequest(int LeaveDays) {
        if(LeaveDays<=2)
        {
            System.out.println("班主任批准您请假" + LeaveDays + "天。");
        }
        else
        {
            if(getNext() != null)
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
