package com.optimize.design_model.flyweight;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author: Kerwinnli
 * @date: 2023/11/27 19:15
 */
public class ReportManagerFactory {

    private static final Map<String, IReportManager> FINANCIAL_REPORT_MAP = new ConcurrentHashMap<>();

    private static final Map<String, IReportManager> EMPLOYEE_REPORT_MAP = new ConcurrentHashMap<>();

    public IReportManager getFinancialReportManager(String tenantId) {
        IReportManager iReportManager;
        if (FINANCIAL_REPORT_MAP.containsKey(tenantId)) {
            iReportManager = FINANCIAL_REPORT_MAP.get(tenantId);
        } else {
            iReportManager = new FinancialReportManager(tenantId);
            IReportManager manager = FINANCIAL_REPORT_MAP.putIfAbsent(tenantId, iReportManager);
            if (manager != null) {
                iReportManager = manager;
            }
        }
        return iReportManager;
    }


    public IReportManager getEmployeeManager(String tenantId) {
        IReportManager iReportManager;
        if (EMPLOYEE_REPORT_MAP.containsKey(tenantId)) {
            iReportManager = EMPLOYEE_REPORT_MAP.get(tenantId);
        } else {
            iReportManager = new EmployeeReportManager(tenantId);
            IReportManager manager = EMPLOYEE_REPORT_MAP.putIfAbsent(tenantId, iReportManager);
            if (manager != null) {
                iReportManager = manager;
            }
        }
        return iReportManager;
    }
}
