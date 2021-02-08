package com.designmodel.demo.test.service;

import com.designmodel.demo.test.query.BaseQuery;

import java.util.List;

/**
 * @program: designmodel
 * @className: QueryService
 * @Description:
 * @author: Mr.Cui
 * @Date: 2021/2/8 16:15
 */
public interface QueryService<E,T extends BaseQuery> {

    List<E> queryAll(T t);
}
