package com.optimize.design_model.adapter;

import net.sf.cglib.proxy.Enhancer;

import java.lang.reflect.Proxy;

/**
 * @author: Kerwinnli
 * @date: 2023/11/23 19:28
 */
public class Main {

    public static void main(String[] args) {
//        //静态代理
//        IDBQuery idbQuery = new DBQueryProxy();
//        idbQuery.request();
        //jdk动态代理
//        IDBQuery idbQuery = (IDBQuery) Proxy.newProxyInstance(ClassLoader.getSystemClassLoader(),new Class[]{IDBQuery.class}, new JdkDBQueryProxy());
//        System.out.println(idbQuery.request());
        //cglib动态代理
        Enhancer enhancer = new Enhancer();
        enhancer.setCallback(new CGLibDBQueryProxy());
        enhancer.setInterfaces(new Class[]{IDBQuery.class});
        IDBQuery idbQuery = (IDBQuery) enhancer.create();
        System.out.println(idbQuery.request());
    }
}
