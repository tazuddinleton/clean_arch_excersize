package org.example.ocp.presenter.print;

import org.example.ocp.controller.FinancialReportPresenter;
import org.example.ocp.interactor.FinancialReportResponse;

public class PrintPresenter implements FinancialReportPresenter {
    PrintViewModel model;
    PrintView view;

    PrintPresenter(PrintViewModel m, PrintView v) {
        model = m;
        view = v;
    }

    @Override
    public void present(FinancialReportResponse r) {

    }
}
