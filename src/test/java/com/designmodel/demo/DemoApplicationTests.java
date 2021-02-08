package com.designmodel.demo;

import com.alibaba.fastjson.JSON;
import com.designmodel.demo.strategy.Strategy;
import com.designmodel.demo.test.domain.Person;
import com.designmodel.demo.test.domain.User;
import com.designmodel.demo.test.service.BaseInterface;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.HashMap;
import java.util.Map;

@SpringBootTest
class DemoApplicationTests {

    @Autowired
    Strategy strategy;

    @Autowired
    BaseInterface<Person> personBaseInterface;

    @Autowired
    BaseInterface<User> userTestInterface;

    @Test
    public void test01(){
        strategy.strategyMethod();
    }

    @Test
    public void test02(){
        String s1 = new String("a") + new String("b");
        s1.intern();
        String s2 = "ab";
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s1 == s2);

        String s3 = new String("1") + new String("2");
        String s4 = "12";
        String intern = s3.intern();
        System.out.println(intern);
        System.out.println(s3);
        System.out.println(s4);
        System.out.println(s3 == s4);

    }

    @Test
    public void testPerson(){
        Person person = new Person();
        System.out.println(person.getName());
        String jsonStr = JSON.toJSONString(person);
        System.out.println(jsonStr);
        Person t = personBaseInterface.getT(jsonStr);

        System.out.println(t);
    }

    @Test
    public void testUser(){
        User user = new User(1,"xiaoming");
        String jsonStr = JSON.toJSONString(user);
        System.out.println(jsonStr);
        User t = userTestInterface.getT(jsonStr);

        System.out.println(t);

        Map<String,String> map = new HashMap<>();
    }

}
