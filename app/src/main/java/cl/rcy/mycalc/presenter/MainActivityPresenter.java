package cl.rcy.mycalc.presenter;

public interface MainActivityPresenter {

    void add (String number1, String number2);  // Interactor

    void showError (String error);              // View

    void showResult (String result);            // View
}
