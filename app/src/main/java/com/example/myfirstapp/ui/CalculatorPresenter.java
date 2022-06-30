package com.example.myfirstapp.ui;

import com.example.myfirstapp.model.Calculator;

public class CalculatorPresenter {
    private CalculatorView view;
    private Calculator calculator;

    public CalculatorPresenter(CalculatorView view, Calculator calculator) {
        this.view = view;
        this.calculator = calculator;
    }

    public void KeyOnePressed() {
    }
}