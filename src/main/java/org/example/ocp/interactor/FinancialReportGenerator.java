package org.example.ocp.interactor;

public class FinancialReportGenerator implements FinancialReportRequester{
    FinancialDataGateway gateway;

    @Override
    public FinancialReportResponse request(FinancialReportRequest r) {
        var data = gateway.getData();
        return new FinancialReportResponse();
    }
}
