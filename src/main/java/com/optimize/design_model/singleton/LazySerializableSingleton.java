package com.optimize.design_model.singleton;

/**
 * @author: Kerwinnli
 * @date: 2023/11/22 16:14
 */
public class LazySerializableSingleton {

    private static LazySerializableSingleton lazySerializableSingleton;

    private LazySerializableSingleton() {
        if (lazySerializableSingleton != null) {
            throw new RuntimeException();
        }
    }
}
