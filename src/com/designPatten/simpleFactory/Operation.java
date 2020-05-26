package com.designPatten.simpleFactory;

public class Operation {
    protected double double_numberA = 0;
    protected double double_numberB = 0;

    public double getDouble_numberA() {
        return double_numberA;
    }

    public void setDouble_numberA(double double_numberA) {
        this.double_numberA = double_numberA;
    }

    public double getDouble_numberB() {
        return double_numberB;
    }

    public void setDouble_numberB(double double_numberB) {
        this.double_numberB = double_numberB;
    }

    public double getResult() {
        double result=0d;
        return result;
    }
}
