package com.optimize.design_model.singleton;

/**
 * 简单版的单例模式
 *
 * @author: Kerwinnli
 * @date: 2023/11/22 15:30
 */
public class UnLazySingleton {

    private UnLazySingleton() {}

    private static final UnLazySingleton UN_LAZY_SINGLETON = new UnLazySingleton();

    public static UnLazySingleton getInstance() {
        return UN_LAZY_SINGLETON;
    }
}
