package com.optimize.design_model.adapter;

import java.util.concurrent.TimeUnit;

/**
 * @author: Kerwinnli
 * @date: 2023/11/23 19:27
 */
public class DBQuery implements IDBQuery{

    public DBQuery() {
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public String request() {
        return "DBQuery request";
    }
}
