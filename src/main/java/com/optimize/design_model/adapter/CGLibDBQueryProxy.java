package com.optimize.design_model.adapter;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author: Kerwinnli
 * @date: 2023/11/23 19:36
 */
public class CGLibDBQueryProxy implements MethodInterceptor {


    private DBQuery dbQuery;

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        if (dbQuery == null) {
            dbQuery = new DBQuery();
        }
        return dbQuery.request();
    }
}
