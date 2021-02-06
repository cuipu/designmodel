package com.designmodel.demo.test.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.commons.lang3.StringUtils;

/**
 * @program: designmodel
 * @className: Person
 * @Description:
 * @author: Mr.Cui
 * @Date: 2021/2/6 20:53
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Person {

    private String name;

    private Integer age;

    public String getName() {
        if (StringUtils.isBlank(this.name)) {
            return "hello";
        }
        return name;
    }
}
