package com.optimize.design_model.singleton;

import java.io.Serializable;

/**
 * @author: Kerwinnli
 * @date: 2023/11/22 15:56
 */
public class SerializableSingleton implements Serializable {

    private SerializableSingleton() {
    }

    private static class SerializableSingletonHolder {
        private static final SerializableSingleton SERIALIZABLE_SINGLETON = new SerializableSingleton();
    }

    public static SerializableSingleton getInstance() {
        return SerializableSingletonHolder.SERIALIZABLE_SINGLETON;
    }

    /**
     * 使用此方法避免反序列化得到单例对象
     */
    protected Object readResolve() {
        return getInstance();
    }
}

