package br.com.jse.coupling;

public class EmailModule {
    public void sendPurchaseMail(Sale sale) {
        System.out.println("Purchase email send.".concat(sale.toString()));
    }
}
