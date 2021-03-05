package br.com.jse.coupling;

public class DAOModule {
    public void savPurchase (Sale sale){
        System.out.println("Purchase saved.".concat(sale.toString()));
    }
}
