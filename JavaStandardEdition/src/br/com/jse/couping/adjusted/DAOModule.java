package br.com.jse.couping.adjusted;

public class DAOModule implements AfterSale {

    @Override
    public void execute(Sale sale) {
        System.out.println("Save. ".concat(sale.toString()));


    }
}
