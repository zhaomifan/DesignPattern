package com.designPatten.simpleFactory;

public class OperationMul extends Operation {
    @Override
    public double getResult() {
        return super.double_numberA * super.double_numberB;
    }
}
