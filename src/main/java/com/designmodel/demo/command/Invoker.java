package com.designmodel.demo.command;

import lombok.Data;

/**
 * @program: designmodel
 * @className: Invoker
 * @Description: 调用者
 * @author: Mr.Cui
 * @Date: 2020/9/4 23:02
 */
@Data
public class Invoker {

    private Command command;

    public Invoker() {
    }

    public Invoker(Command command) {
        this.command = command;
    }

    public void call()
    {
        System.out.println("调用者执行命令command...");
        command.execute();
    }


    public void call1()
    {
        System.out.println("调用者执行命令command...");
        command.execute1();
    }
}
