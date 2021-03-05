package br.com.jse.couping.adjusted;

import java.util.ArrayList;
import java.util.List;

public class SaleTest {
    public static void main(String[] args) {
        EmailModule email = new EmailModule();
        DAOModule dao = new DAOModule();
        SMSModule sms = new SMSModule();

        List<AfterSale> actions = new ArrayList<>();
        actions.add(email);
        actions.add(dao);
        actions.add(sms);

        Sale sale = new Sale();
        sale.setPrice(1000.0);
        sale.setProduct("TV");

        PurchaseRegister purchase = new PurchaseRegister();
        purchase.afterPurchase(actions, sale);

    }
}
