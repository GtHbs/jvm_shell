package com.optimize.design_model.adapter;

/**
 * @author: Kerwinnli
 * @date: 2023/11/23 19:28
 */
public class DBQueryProxy implements IDBQuery{


    private DBQuery dbQuery;

    @Override
    public String request() {
        if (dbQuery == null) {
            dbQuery = new DBQuery();
        }
        return dbQuery.request();
    }
}
