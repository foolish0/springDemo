package com.example.demo.test;

public class Calc {
    private int count = 0;
    private double sum = 0.0D;

    public void submit(double value) {
         this.count++;
         this.sum += value;
    }

    public double getAvg() {
         if (0 == count) {
              return sum;
         }
         return this.sum/this.count;
    }
}
