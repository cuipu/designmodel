package com.designmodel.demo.test.service.impl;

import com.designmodel.demo.test.domain.Person;
import com.designmodel.demo.test.service.PersonService;
import com.designmodel.demo.test.service.abstrast.AbstrastPersonService;
import org.springframework.stereotype.Service;

/**
 * @program: designmodel
 * @className: TestService
 * @Description:
 * @author: Mr.Cui
 * @Date: 2021/2/6 20:53
 */
@Service
public class PersonServiceImpl extends AbstrastPersonService implements PersonService {

    @Override
    public String showMsg(Person person) {
        return null;
    }
}
