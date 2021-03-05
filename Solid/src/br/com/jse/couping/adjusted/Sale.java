package br.com.jse.couping.adjusted;

public class Sale {
    private Double price;
    private String product;


    @Override
    public String toString() {
        return "Sale{" +
                "price=" + price +
                ", product='" + product + '\'' +
                '}';
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }
}
