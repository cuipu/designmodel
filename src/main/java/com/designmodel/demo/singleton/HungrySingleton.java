package com.designmodel.demo.singleton;

/**
 * 饿汉式单例
 * 该模式的特点是类一旦加载就创建一个单例，保证在调用 getInstance 方法之前单例已经存在了。
 * <p>
 * 饿汉式单例在类创建的同时就已经创建好一个静态的对象供系统使用，以后不再改变，所以是线程安全的，可以直接用于多线程而不会出现问题。
 * <p>
 * 个人理解：类似于静态代码块一样，创建类的时候一次性初始化完毕
 *
 * @program: designmodel
 * @className: HungrySingleton
 * @Description:
 * @author: Mr.Cui
 * @Date: 2020/8/14 21:48
 */
public class HungrySingleton {

    private static final HungrySingleton instance = new HungrySingleton();

/*
    private static final HungrySingleton instance = null;

    静态代码块初始化，不知道是否正确
    static {
        instance = new HungrySingleton();
    }
*/

    private HungrySingleton() {
    }

    public static HungrySingleton getInstance() {
        return instance;
    }
}
