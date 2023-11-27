package com.optimize.design_model.flyweight;

/**
 * 财务报表
 *
 * @author: Kerwinnli
 * @date: 2023/11/27 19:14
 */
public class FinancialReportManager implements IReportManager{


    protected String tenantId = null;

    public FinancialReportManager(String tenantId) {
        this.tenantId = tenantId;
    }

    @Override
    public String createReport() {
        return "This is financial report!";
    }
}
