package br.com.jse.couping.adjusted;

public class EmailModule implements AfterSale{

    @Override
    public void execute(Sale sale) {
        System.out.println("Email send ".concat(sale.toString()));
    }
}
