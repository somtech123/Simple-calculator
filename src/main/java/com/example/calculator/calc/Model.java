package com.example.calculator.calc;

public class Model {
    public long calculate(long number1, long number2, String operator){
        switch (operator){
            case "+":
                return number1 + number2;
            case "-":
                return number1 - number2;

            case "/":
                if (number2 == 0){
                    return 0;
                } else {
                    return number1 / number2;
                }
            case "*":
                return number1 * number2;
        }
        System.out.println("unknown operator " + operator);
        return 0;
    }
}
