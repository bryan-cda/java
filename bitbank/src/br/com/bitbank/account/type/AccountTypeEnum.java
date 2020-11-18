package br.com.bitbank.account.type;

public enum  AccountTypeEnum {
    CC("CURRENT"),
    CP("SAVING"),
    SAL("SALARY"),
    ENT("ENTERPRISE");

    String type;

    AccountTypeEnum(String type){
        this.type = type;
    }
}
