package com.designmodel.demo;

import com.designmodel.demo.strategy.ConcreteStrategyA;
import com.designmodel.demo.strategy.Strategy;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoApplicationTests {

    @Test
    void contextLoads() {
        ConcreteStrategyA concreteStrategyA = new ConcreteStrategyA();
        if (concreteStrategyA instanceof Strategy){
            System.out.println("true");
        }
    }

    public static void main(String[] args) {
        ConcreteStrategyA concreteStrategyA = new ConcreteStrategyA();
        if (concreteStrategyA instanceof Strategy){
            System.out.println("true");
        }
    }

}
