package com.designmodel.demo.command;

import lombok.Data;

/**
 * @program: designmodel
 * @className: ConcreteCommand
 * @Description: 具体命令
 * @author: Mr.Cui
 * @Date: 2020/9/4 22:58
 */
@Data
public class ConcreteCommand implements Command{

    private Receiver receiver;

    /**
     * 空参构造函数
     */
    public ConcreteCommand() {
        this.receiver = new Receiver();
    }

    public ConcreteCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.action();
    }

    @Override
    public void execute1() {
        receiver.action1();
    }
}
