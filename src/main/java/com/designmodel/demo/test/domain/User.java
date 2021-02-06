package com.designmodel.demo.test.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @program: designmodel
 * @className: User
 * @Description:
 * @author: Mr.Cui
 * @Date: 2021/2/6 22:03
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {

    private Integer id;

    private String userName;

}
