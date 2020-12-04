package br.com.jse.couping.adjusted;

import java.util.ArrayList;
import java.util.List;

public class PurchaseRegister {
    private List<AfterSale> actions = new ArrayList<>();
    private Sale sale;

    public PurchaseRegister() {
    }

    public void afterPurchase(List<AfterSale> actions, Sale sale){
        for(AfterSale action : actions){
            action.execute(sale);
        }
    }
}
