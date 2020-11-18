package br.com.bitbank.account.type;

public enum  TransactionTypeEnum {
    TED("TED", 12.0),
    DOC("DOC", 10.0),
    PIX("PIX", 0.0);

    public String type;
    public Double fee;

     TransactionTypeEnum(String type, Double fee){
        this.type = type;
        this.fee = fee;
    }

}
