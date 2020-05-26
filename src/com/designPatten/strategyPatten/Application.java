package com.designPatten.strategyPatten;

public class Application {
    double total=0.0d;

    public static void main(String[] args) {
        Application app=new Application();
        app.btnClick();
    }
    private void btnClick() {
        String type = "打8折";//打折类型
        String price="10";//单价
        String num = "23";//数量
        CashSuper cs = CashFactory.createCashAcceptor(type);
        double totalPrice=0.0d;
        totalPrice=cs.acceptCash(Double.parseDouble(price))*Double.parseDouble(num);
        total+=totalPrice;
        String sentenceFormat = "单价:%s\n数量:%s\n计价类型:%s\n合计:%f";
        System.out.printf(sentenceFormat,price,num,type,total);
    }
}
