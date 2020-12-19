package com.designmodel.demo.bridge;

/**
 * @program: designmodel
 * @className: RefinedAbstractionB
 * @Description:
 * @author: Mr.Cui
 * @Date: 2020/8/21 22:35
 */
public class RefinedAbstractionB extends Abstraction{

    protected RefinedAbstractionB(Implementor implementor) {
        super(implementor);
    }

    @Override
    public void Operation() {
        System.out.println("扩展抽象化(Refined AbstractionB)角色被访问");
        super.implementor.OperationImpl();
    }
}
