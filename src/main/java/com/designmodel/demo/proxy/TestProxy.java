package com.designmodel.demo.proxy;

/**
 * @program: designmodel
 * @className: TestProxy
 * @Description: 代理模式的定义：由于某些原因需要给某对象提供一个代理以控制对该对象的访问。这时，访问对象不适合或者不能直接引用目标对象，代理对象作为访问对象和目标对象之间的中介。
 *
 * 代理模式的主要优点有：
 * 代理模式在客户端与目标对象之间起到一个中介作用和保护目标对象的作用；
 * 代理对象可以扩展目标对象的功能；
 * 代理模式能将客户端与目标对象分离，在一定程度上降低了系统的耦合度；
 *
 * 其主要缺点是：
 * 在客户端和目标对象之间增加一个代理对象，会造成请求处理速度变慢；
 * 增加了系统的复杂度；
 *
 * . 模式的结构
 * 代理模式的主要角色如下。
 * 抽象主题（Subject）类：通过接口或抽象类声明真实主题和代理对象实现的业务方法。
 * 真实主题（Real Subject）类：实现了抽象主题中的具体业务，是代理对象所代表的真实对象，是最终要引用的对象。
 * 代理（Proxy）类：提供了与真实主题相同的接口，其内部含有对真实主题的引用，它可以访问、控制或扩展真实主题的功能。
 *
 * 个人理解：AOP面向切面编程，记录操作日志的时候需要做切面
 * 要在 Spring 中声明 AspectJ 切面
 *
 * @Before: 前置通知, 在方法执行之前执行
 * @After: 后置通知, 在方法执行之后执行 。
 * @AfterRunning: 返回通知, 在方法返回结果之后执行
 * @AfterThrowing: 异常通知, 在方法抛出异常之后
 * @Around: 环绕通知, 围绕着方法执行
 *
 *
 * @author: Mr.Cui
 * @Date: 2020/8/24 21:58
 */
public class TestProxy {

    public static void main(String[] args) {
        RealSubject realSubject = new RealSubject();

        Proxy proxy = new Proxy();
        proxy.Request();
    }
}
