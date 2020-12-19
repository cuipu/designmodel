package com.designmodel.demo.singleton;

/**
 * @program: designmodel
 * @className: LazySingleton
 * @Description: 最简单的单例模式
 * @author: Mr.Cui
 * @Date: 2020/8/14 21:35
 */
public class SimpleSingleton {

    /**
     * 记得出花值 = null
     */
    private static SimpleSingleton simpleSingleton;

    /**
     * 私有化构造方法，不能new
     */
    private SimpleSingleton() {
    }

    /**
     * @Description:
     * @param: null
     * @return:
     * @Author: Mr.Cui
     * @Date: 2020/8/14 21:38
     */
    public static SimpleSingleton getInstance() {
        if (simpleSingleton == null) {
            simpleSingleton = new SimpleSingleton();
        }
        System.out.println("已经存在SimpleSingleton");
        return simpleSingleton;
    }
}
