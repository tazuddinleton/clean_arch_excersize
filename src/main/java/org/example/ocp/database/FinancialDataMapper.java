package org.example.ocp.database;

import org.example.ocp.interactor.FinancialDataGateway;
import org.example.ocp.interactor.FinancialReportEntity;

import java.util.ArrayList;
import java.util.List;

public class FinancialDataMapper implements FinancialDataGateway {
    FinancialDatabase db;
    FinancialReportEntity entity;

    @Override
    public List<FinancialReportEntity> getData() {
        return new ArrayList<>();
    }
}
