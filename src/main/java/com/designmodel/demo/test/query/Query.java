package com.designmodel.demo.test.query;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @program: designmodel
 * @className: Query
 * @Description:
 * @author: Mr.Cui
 * @Date: 2021/2/8 12:24
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Query <T>{

    private T t;

}
