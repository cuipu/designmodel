package com.designmodel.demo.factory;

import com.alibaba.fastjson.JSONObject;
import lombok.*;

/**
 * @program: designmodel
 * @className: ConcreteFactory1
 * @Description: 具体工厂1：实现了厂品的生成方法
 * @author: Mr.Cui
 * @Date: 2020/8/18 22:13
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ConcreteFactory1<T> implements AbstractFactory {

    @NonNull
    private Class<T> clazz;

    @Override
    public T getT() {
        return JSONObject.parseObject("",this.clazz);
    }

    @Override
    public Product newProduct() {
        System.out.println("具体工厂1生成-->具体产品1...");
        //T t = JSON.parseObject("", this.clazz);
        return new ConcreteProduct1();
    }
}
