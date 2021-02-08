package com.designmodel.demo.test.service;

import com.designmodel.demo.test.query.BaseQuery;
import com.designmodel.demo.test.query.Query;

/**
 * @program: designmodel
 * @className: StudentService
 * @Description:
 * @author: Mr.Cui
 * @Date: 2021/2/8 12:25
 */
public interface StudentService {

    void termQuery(Query<? extends BaseQuery> query);

}
