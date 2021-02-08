package com.designmodel.demo.test.service.impl;

import com.designmodel.demo.test.domain.Person;
import com.designmodel.demo.test.query.TermBaseQuery;
import com.designmodel.demo.test.service.abstrast.AbstarctQueryService;

import java.util.List;

/**
 * @program: designmodel
 * @className: QueryServiceImpl
 * @Description:
 * @author: Mr.Cui
 * @Date: 2021/2/8 16:50
 */
public class QueryServiceImpl extends AbstarctQueryService {

    @Override
    public List<Person> queryByTermBaseQuery(TermBaseQuery termBaseQuery) {
        return null;
    }
}
