package com.designmodel.demo.test.service.abstrast;

import com.alibaba.fastjson.JSONObject;
import com.designmodel.demo.test.domain.User;
import com.designmodel.demo.test.service.BaseInterface;

/**
 * @program: designmodel
 * @className: AbstrastUserTestService
 * @Description:
 * @author: Mr.Cui
 * @Date: 2021/2/6 22:03
 */
public class AbstrastUserService implements BaseInterface<User> {

    @Override
    public User getT(String jsonStr) {
        return JSONObject.parseObject(jsonStr, User.class);
    }
}
