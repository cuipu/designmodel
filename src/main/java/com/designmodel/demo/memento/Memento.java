package com.designmodel.demo.memento;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @program: designmodel
 * @className: Memento
 * @Description: 备忘录
 * @author: Mr.Cui
 * @Date: 2020/9/7 21:04
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Memento {

    /**
     * 可以是个类，集合什么的
     */
    private String state;
}
