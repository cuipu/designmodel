package com.designmodel.demo.bridge;

/**
 * @program: designmodel
 * @className: RefinedAbstraction
 * @Description: 扩展抽象化角色A
 * @author: Mr.Cui
 * @Date: 2020/8/21 22:23
 */
public class RefinedAbstractionA extends Abstraction {

    protected RefinedAbstractionA(Implementor implementor) {
        super(implementor);
    }

    @Override
    public void Operation() {

        System.out.println("扩展抽象化(Refined AbstractionA)角色被访问");
        super.implementor.OperationImpl();
    }
}
