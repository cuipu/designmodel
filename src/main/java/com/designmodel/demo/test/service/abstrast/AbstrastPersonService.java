package com.designmodel.demo.test.service.abstrast;

import com.alibaba.fastjson.JSONObject;
import com.designmodel.demo.test.domain.Person;
import com.designmodel.demo.test.service.BaseInterface;

/**
 * @program: designmodel
 * @className: AbstrastTestService
 * @Description:
 * @author: Mr.Cui
 * @Date: 2021/2/6 21:01
 */
public abstract class AbstrastPersonService implements BaseInterface<Person> {

    @Override
    public Person getT(String jsonStr) {
        return JSONObject.parseObject(jsonStr,Person.class);
    }
}
