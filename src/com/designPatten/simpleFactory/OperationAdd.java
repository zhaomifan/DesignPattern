package com.designPatten.simpleFactory;

public class OperationAdd extends Operation {
    @Override
    public double getResult() {
        return super.double_numberA + super.double_numberB;
    }
}
