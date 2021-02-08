package com.designmodel.demo.test.service.abstrast;

import com.designmodel.demo.test.domain.Person;
import com.designmodel.demo.test.query.TermBaseQuery;
import com.designmodel.demo.test.service.QueryService;

import java.util.List;

/**
 * @program: designmodel
 * @className: QueryServiceImpl
 * @Description:
 * @author: Mr.Cui
 * @Date: 2021/2/8 16:16
 */
public abstract class AbstarctQueryService implements QueryService<Person, TermBaseQuery>{

    @Override
    public List<Person> queryAll(TermBaseQuery termBaseQuery) {
        return null;
    }

    public abstract List<Person> queryByTermBaseQuery(TermBaseQuery termBaseQuery);
}
