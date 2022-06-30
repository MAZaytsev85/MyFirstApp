package com.example.myfirstapp.ui;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.myfirstapp.R;
import com.example.myfirstapp.model.CalculatorClass;
import com.example.myfirstapp.model.Operator;

import java.util.HashMap;
import java.util.Map;

public class CalcActivity extends AppCompatActivity implements CalculatorView {

    private TextView resultTxt;

    private CalculatorPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.calc_layout);

        resultTxt = findViewById(R.id.result);

        presenter = new CalculatorPresenter(this, new CalculatorClass());

            Map<Integer, Integer> digits = new HashMap<>();
            digits.put(R.id.key_1, 1);
            digits.put(R.id.key_2, 2);
            digits.put(R.id.key_3, 3);
            digits.put(R.id.key_4, 4);
            digits.put(R.id.key_5, 5);
            digits.put(R.id.key_6, 6);
            digits.put(R.id.key_7, 7);
            digits.put(R.id.key_8, 8);
            digits.put(R.id.key_9, 9);
            digits.put(R.id.key_0, 0);

        View.OnClickListener digitClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                presenter.onDigitPressed(digits.get(view.getId()));
            }
        };

        findViewById(R.id.key_1).setOnClickListener(digitClickListener);
        findViewById(R.id.key_2).setOnClickListener(digitClickListener);
        findViewById(R.id.key_3).setOnClickListener(digitClickListener);
        findViewById(R.id.key_4).setOnClickListener(digitClickListener);
        findViewById(R.id.key_5).setOnClickListener(digitClickListener);
        findViewById(R.id.key_6).setOnClickListener(digitClickListener);
        findViewById(R.id.key_7).setOnClickListener(digitClickListener);
        findViewById(R.id.key_8).setOnClickListener(digitClickListener);
        findViewById(R.id.key_9).setOnClickListener(digitClickListener);
        findViewById(R.id.key_0).setOnClickListener(digitClickListener);

        Map<Integer, Operator> operators = new HashMap<>();
        operators.put(R.id.key_plus, Operator.ADD);
        operators.put(R.id.key_min, Operator.DIV);
        operators.put(R.id.key_mnozh, Operator.MULT);
        operators.put(R.id.key_del, Operator.SUB);


        View.OnClickListener operatorsClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                presenter.onOperatorPressed(operators.get(view.getId()));
            }
        };

        findViewById(R.id.key_plus).setOnClickListener(operatorsClickListener);
        findViewById(R.id.key_min).setOnClickListener(operatorsClickListener);
        findViewById(R.id.key_mnozh).setOnClickListener(operatorsClickListener);
        findViewById(R.id.key_del).setOnClickListener(operatorsClickListener);

        findViewById(R.id.key_zap).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                presenter.onZapPressed();
            }
        });


    }

    @Override
    public void showResult(String result) {

        resultTxt.setText(result);

    }
}
