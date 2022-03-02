package cl.rcy.mycalc.interactor;

import cl.rcy.mycalc.presenter.MainActivityPresenter;

public class MainActivityInteractorImpl implements MainActivityInteractor{

    private MainActivityPresenter mainActivityPresenter;

    public MainActivityInteractorImpl(MainActivityPresenter mainActivityPresenter) {
        this.mainActivityPresenter = mainActivityPresenter;
    }

    @Override
    public void add(String number1, String number2) {
        Double result = Double.valueOf(number1) + Double.valueOf(number2);
        mainActivityPresenter.showResult(String.valueOf(result));
        // mainActivityPresenter.showError(error);
    }
}
