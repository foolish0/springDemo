package com.example.demo.test;

public class LocalVariableTest {
    public static void main(String[] args) {
        Calc calc = new Calc();
        int num1 = 1;
        int num2 = 2;
        calc.submit(num1);
        calc.submit(num2);
        double avg = calc.getAvg();
    }
}
