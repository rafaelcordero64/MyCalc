package cl.rcy.mycalc.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import cl.rcy.mycalc.R;
import cl.rcy.mycalc.presenter.MainActivityPresenter;
import cl.rcy.mycalc.presenter.MainActivityPresenterImpl;

public class MainActivity extends AppCompatActivity implements MainActivityView {

    private MainActivityPresenter mainActivityPresenter;
    private EditText st_et_number1;
    private EditText st_et_number2;
    private TextView st_tv_result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        st_et_number1 = findViewById(R.id.id_et_number1);
        st_et_number2 = findViewById(R.id.id_et_number2);
        st_tv_result  = findViewById(R.id.id_tv_result);

        mainActivityPresenter = new MainActivityPresenterImpl(this);

    }

    public void add (View view) {
        String number1 = st_et_number1.getText().toString();
        String number2 = st_et_number2.getText().toString();

        mainActivityPresenter.add(number1, number2);
    }

    @Override
    public void showResult(String result) {
        st_tv_result.setText(result);
    }

    @Override
    public void showError(String error) {
        st_tv_result.setText(error);
    }
}