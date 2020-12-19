package com.designmodel.demo.bridge;

/**
 * @program: designmodel
 * @className: ConcreteImplementorA
 * @Description: 具体实现化角色A
 * @author: Mr.Cui
 * @Date: 2020/8/21 22:21
 */
public class ConcreteImplementorA implements Implementor {
    @Override
    public void OperationImpl() {
        System.out.println("具体实现化(Concrete ImplementorA)角色被访问" );
    }
}
