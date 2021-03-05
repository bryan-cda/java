package br.com.jse.coupling;

public class SMSModule {
    public void sendPurchaseSms(Sale  sale){
        System.out.println("Sms send.".concat(sale.toString()));
    }
}
