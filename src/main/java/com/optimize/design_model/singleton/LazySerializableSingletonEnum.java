package com.optimize.design_model.singleton;

/**
 * @author: Kerwinnli
 * @date: 2023/11/22 16:13
 */
public enum LazySerializableSingletonEnum {
    INSTANCE;

    private LazySerializableSingleton lazySerializableSingleton;

    private LazySerializableSingletonEnum() {
    }

}
