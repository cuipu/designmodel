package com.designmodel.demo.memento;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @program: designmodel
 * @className: Originator
 * @Description: 发起人
 * @author: Mr.Cui
 * @Date: 2020/9/7 21:06
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Originator {

    /**
     * 可以是个类，集合什么的，对应Memento中的state
     */
    private String state;

    public Memento createMemento(){
        return new Memento(state);
    }

    public void restoreMemento(Memento memento){
        this.setState(memento.getState());
    }
}
