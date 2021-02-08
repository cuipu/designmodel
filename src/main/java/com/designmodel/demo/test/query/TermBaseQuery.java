package com.designmodel.demo.test.query;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Map;

/**
 * @program: designmodel
 * @className: TermBaseQuery
 * @Description:
 * @author: Mr.Cui
 * @Date: 2021/2/8 12:28
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class TermBaseQuery extends BaseQuery{

    Map<String,String > termMap;
}
