package com.optimize.design_model.singleton;

/**
 * @author: Kerwinnli
 * @date: 2023/11/22 15:39
 */
public class MultiThreadSingleton {

    private volatile static MultiThreadSingleton multiThreadSingleton;

    private MultiThreadSingleton() {
        if (multiThreadSingleton != null) {
            throw new RuntimeException();
        }
    }

    public static MultiThreadSingleton getInstance() {
        if (multiThreadSingleton == null) {
            synchronized (MultiThreadSingleton.class) {
                if (multiThreadSingleton == null) {
                    multiThreadSingleton = new MultiThreadSingleton();
                }
            }
        }
        return multiThreadSingleton;
    }
}


