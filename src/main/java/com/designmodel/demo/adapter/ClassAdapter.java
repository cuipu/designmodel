package com.designmodel.demo.adapter;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @program: designmodel
 * @className: ClassAdapter
 * @Description:
 * @author: Mr.Cui
 * @Date: 2020/8/17 22:10
 */
@Data
@NoArgsConstructor
@Builder
public class ClassAdapter extends Adaptee implements Target{

    @Override
    public void request() {
        // 调用父类方法，复杂一点的需要传入参数需要做处理，需要返回值的也需要处理
        super.specificRequest();
    }
}
