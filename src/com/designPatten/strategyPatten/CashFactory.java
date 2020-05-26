package com.designPatten.strategyPatten;

public class CashFactory {
    public static CashSuper createCashAcceptor(String type) {
        CashSuper cs=null;
        switch (type) {
            case "正常收费":
                cs= new CashNormal();
                break;
            case "满300减80":
                CashReturn cr1= new CashReturn("300", "100");
                cs=cr1;
                break;
            case "打8折":
                CashSuper csr2= new CashRebate(0.8);
                cs=csr2;
                break;
        }
        return cs;
    }
}
