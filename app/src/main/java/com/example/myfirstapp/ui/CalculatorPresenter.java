package com.example.myfirstapp.ui;

import com.example.myfirstapp.model.Calculator;
import com.example.myfirstapp.model.Operator;

public class CalculatorPresenter {
    private CalculatorView view;
    private Calculator calculator;

    public CalculatorPresenter(CalculatorView view, Calculator calculator) {
        this.view = view;
        this.calculator = calculator;
    }

    public void KeyOnePressed() {
    }

    public void onDigitPressed(int digit) {
    }

    public void onOperatorPressed(Operator operator) {
    }

    public void onZapPressed() {
    }
}