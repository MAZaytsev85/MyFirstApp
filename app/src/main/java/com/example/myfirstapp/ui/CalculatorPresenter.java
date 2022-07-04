package com.example.myfirstapp.ui;

import com.example.myfirstapp.model.Calculator;
import com.example.myfirstapp.model.Operator;

public class CalculatorPresenter {
    private CalculatorView view;
    private Calculator calculator;

    private double argOne;
    private Double argTwo;
    private Operator selectedOperator;

    public CalculatorPresenter(CalculatorView view, Calculator calculator) {
        this.view = view;
        this.calculator = calculator;
    }


    public void onDigitPressed(int digit) {

        if (argTwo == null) {


            argOne = argOne * 10 + digit;

            view.showResult(String.valueOf(argOne));

        } else {
            argTwo = argTwo * 10 + digit;
        }
    }

    public void onOperatorPressed(Operator operator) {
        if (selectedOperator == null) {

            argOne = calculator.perform(argOne, argTwo, selectedOperator);

            view.showResult(String.valueOf(argOne));

        }
        argTwo = 0.0;

        selectedOperator = operator;
    }

    public void onZapPressed() {
    }
}