package com.optimize.design_model.adapter;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author: Kerwinnli
 * @date: 2023/11/23 19:34
 */
public class JdkDBQueryProxy implements InvocationHandler {


    private DBQuery dbQuery;

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        if (dbQuery == null) {
            dbQuery = new DBQuery();
        }
        return dbQuery.request();
    }
}
