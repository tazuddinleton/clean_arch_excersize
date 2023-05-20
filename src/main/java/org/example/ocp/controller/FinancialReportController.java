package org.example.ocp.controller;

import org.example.ocp.interactor.FinancialReportRequest;
import org.example.ocp.interactor.FinancialReportRequester;

public class FinancialReportController {
    FinancialReportPresenter presenter;
    FinancialReportRequester requester;

    FinancialReportController(FinancialReportPresenter p, FinancialReportRequester r) {
        presenter = p;
        requester = r;
    }
    public void displayReport() {
        var response = requester.request(new FinancialReportRequest());
        presenter.present(response);
    }


}
