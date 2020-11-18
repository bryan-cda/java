package br.com.bitbank.account.type.current;

import br.com.bitbank.account.Account;
import br.com.bitbank.account.type.AccountTypeEnum;
import br.com.bitbank.account.type.TransactionTypeEnum;

public class CurrentAccount extends Account {
    private AccountTypeEnum accountType;
    private TransactionTypeEnum transactionTypeEnum;

    public AccountTypeEnum getAccountType() {
        return accountType;
    }

    public void setAccountType(AccountTypeEnum accountType) {
        this.accountType = accountType;
    }

    public TransactionTypeEnum getTransactionTypeEnum() {
        return transactionTypeEnum;
    }

    public void setTransactionTypeEnum(TransactionTypeEnum transactionTypeEnum) {
        this.transactionTypeEnum = transactionTypeEnum;
    }

    @Override
    public void transfer(double value, Account account) {
        if(this.getTransactionTypeEnum().type.equalsIgnoreCase("DOC")
                && this.getBalance() > value + TransactionTypeEnum.DOC.fee){
            super.withdraw(value + TransactionTypeEnum.DOC.fee);
            account.deposit(value);
        }

        else if(this.getTransactionTypeEnum().type.equalsIgnoreCase("TED")
                && this.getBalance() > value + TransactionTypeEnum.TED.fee){
            super.withdraw(value + TransactionTypeEnum.TED.fee);
            account.deposit(value);
        }
        /**
         * Pix Case
         */
        else{
            super.withdraw(value);
            account.deposit(value);
        }

    }
}
