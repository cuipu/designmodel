package com.designmodel.demo.ChainofResponsibility;

/**
 * @program: designmodel
 * @className: LeaveApprovalTest
 * @Description:
 * @author: Mr.Cui
 * @Date: 2020/9/26 22:17
 */
public class LeaveApprovalTest {

    public static void main(String[] args) {
        Leader teacher1 = new ClassAdviser();
        Leader teacher2 = new DepartmentHead();
        Leader teacher3 = new Dean();

        teacher1.setNext(teacher2);
        teacher2.setNext(teacher3);

        // 提交请求
        teacher1.handleRequest(8);
    }
}
