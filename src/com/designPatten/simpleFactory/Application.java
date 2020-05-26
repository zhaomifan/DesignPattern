package com.designPatten.simpleFactory;

public class Application {
    //简单工厂模式
    public static void main(String[] args) {
        Operation oper;
        oper = OperationFactory.createOperation("+");
        oper.double_numberA=10d;
        oper.double_numberB=10d;
        double result=oper.getResult();
        System.out.println(result);
    }
}
