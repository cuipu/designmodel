package com.designmodel.demo.memento;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @program: designmodel
 * @className: Caretaker
 * @Description: 管理者
 * @author: Mr.Cui
 * @Date: 2020/9/7 21:07
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Caretaker {

    private Memento memento;

}
