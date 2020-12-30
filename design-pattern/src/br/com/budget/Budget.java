package br.com.budget;

import java.math.BigDecimal;

public class Budget {
    private BigDecimal amount;

    public Budget(BigDecimal amount){
        this.amount = amount;
    }

    public BigDecimal getAmount(){
        return this.amount;
    }
}
