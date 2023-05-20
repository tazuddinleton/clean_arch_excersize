package org.example.ocp.presenter.screen;

import org.example.ocp.controller.FinancialReportPresenter;
import org.example.ocp.interactor.FinancialReportResponse;

public class ScreenPresenter implements FinancialReportPresenter {
    ScreenViewModel model;
    ScreenView view;

    ScreenPresenter(ScreenViewModel m, ScreenView v) {
        model = m;
        view = v;
    }

    @Override
    public void present(FinancialReportResponse r) {

    }
}
