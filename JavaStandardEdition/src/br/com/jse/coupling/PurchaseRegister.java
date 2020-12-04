package br.com.jse.coupling;

public class PurchaseRegister {
    private EmailModule email;
    private SMSModule sms;
    private DAOModule dao;

    public PurchaseRegister(EmailModule email, SMSModule sms, DAOModule dao){
     this.email = email;
     this.sms = sms;
     this.dao = dao;
    }

    public void afterPurchase(Sale sale){
        email.sendPurchaseMail(sale);
        dao.savPurchase(sale);
        sms.sendPurchaseSms(sale);
    }
}
