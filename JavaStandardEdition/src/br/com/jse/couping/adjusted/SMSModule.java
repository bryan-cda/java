package br.com.jse.couping.adjusted;

public class SMSModule implements AfterSale{
    @Override
    public void execute(Sale sale) {
        System.out.println("Sms send. ".concat(sale.toString()));
    }
}
