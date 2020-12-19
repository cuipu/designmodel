package com.designmodel.demo.state;

/**
 * @program: designmodel
 * @className: Context
 * @Description:
 * @author: Mr.Cui
 * @Date: 2020/10/7 21:43
 */
public class Context {

    private State state;
    /**
     * 定义环境类的初始状态
     */
    public Context(){
        this.state=new ConcreteStateA();
    }

    /**
     * 设置新状态
     */
    public void setState(State state)
    {
        this.state=state;
    }
    /**
     * 读取状态
     */
    public State getState()
    {
        return(state);
    }

    /**
     * 对请求做处理
     */
    public void Handle()
    {
        state.Handle(this);
    }
}
