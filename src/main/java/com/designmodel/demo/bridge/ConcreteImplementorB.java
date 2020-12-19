package com.designmodel.demo.bridge;

/**
 * @program: designmodel
 * @className: ConcreteImplementorB
 * @Description: 具体实现化角色B
 * @author: Mr.Cui
 * @Date: 2020/8/21 22:26
 */
public class ConcreteImplementorB implements Implementor{
    @Override
    public void OperationImpl() {
        System.out.println("具体实现化(Concrete ImplementorB)角色被访问" );
    }
}
