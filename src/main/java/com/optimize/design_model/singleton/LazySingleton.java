package com.optimize.design_model.singleton;

/**
 * @author: Kerwinnli
 * @date: 2023/11/22 15:43
 */
public class LazySingleton {


    private LazySingleton() {}

    private static class LazySingletonFactory {
        public static LazySingleton lazySingleton = new LazySingleton();
    }

    public static LazySingleton getInstance() {
        return LazySingletonFactory.lazySingleton;
    }
}
