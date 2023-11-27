package com.optimize.design_model.flyweight;

/**
 * @author: Kerwinnli
 * @date: 2023/11/27 19:15
 */
public class EmployeeReportManager implements IReportManager{

    protected String tenantId = null;

    public EmployeeReportManager(String tenantId) {
        this.tenantId = tenantId;
    }

    @Override
    public String createReport() {
        return "This is employee report!";
    }
}
