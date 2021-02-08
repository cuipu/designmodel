package com.designmodel.demo.chainofresponsibility;

/**
 * @program: designmodel
 * @className: Dean
 * @Description: 具体处理者3：院长类
 * @author: Mr.Cui
 * @Date: 2020/9/26 22:16
 */
public class Dean extends Leader{
    @Override
    public void handleRequest(int LeaveDays) {
        if(LeaveDays<=10)
        {
            System.out.println("院长批准您请假" + LeaveDays + "天。");
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
