package cl.rcy.mycalc.presenter;

import cl.rcy.mycalc.interactor.MainActivityInteractorImpl;
import cl.rcy.mycalc.interactor.MainActivityInteractor;
import cl.rcy.mycalc.view.MainActivityView;

public class MainActivityPresenterImpl implements MainActivityPresenter{

    private MainActivityView mainActivityView;
    private MainActivityInteractor mainActivityInteractor;

    public MainActivityPresenterImpl(MainActivityView mainActivityView) {
        this.mainActivityView = mainActivityView;
        mainActivityInteractor = new MainActivityInteractorImpl(this);
    }

    @Override
    public void add(String number1, String number2) {
        mainActivityInteractor.add(number1, number2);
    }

    @Override
    public void showError(String error) {
        mainActivityView.showError(error);
    }

    @Override
    public void showResult(String result) {
        mainActivityView.showResult(result);
    }
}
