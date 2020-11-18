package br.com.bitbank.online;

import br.com.bitbank.account.type.AccountTypeEnum;
import br.com.bitbank.account.type.TransactionTypeEnum;
import br.com.bitbank.account.type.current.CurrentAccount;
import br.com.bitbank.account.type.savings.SavingAccount;
import br.com.bitbank.client.Client;

public class InternetBaking {
    public static void main(String[] args) {
        CurrentAccount cc = new CurrentAccount();
        SavingAccount cp = new SavingAccount();
        cc.setAgency(4455);
        cc.setAccountNumber(288174);
        cc.setOwner(new Client("Bryan Duarte", "111.333.444.-2","(21) 8899-7712", "Rua B, 15"));
        cc.setAccountType(AccountTypeEnum.CC);
        cc.setBalance(500);
        cc.setTransactionTypeEnum(TransactionTypeEnum.PIX);


        cp.setAgency(5544);
        cp.setAccountNumber(288174);
        cp.setOwner(new Client("Bryan Duarte", "111.333.444.-2","(21) 8899-7712", "Rua B, 15"));
        cp.setBalance(50);
        cc.setAccountType(AccountTypeEnum.CP);

        cc.transfer(200, cp);

        System.out.println("Saldo da conta corrente é de: R$ ".concat(String.valueOf(cc.getBalance())));

        System.out.println("Saldo da conta poupança é de: R$ ".concat(String.valueOf(cp.getBalance())));

        cp.transfer(50, cc);

        System.out.println("Saldo da conta corrente é de: R$ ".concat(String.valueOf(cc.getBalance())));

        System.out.println("Saldo da conta poupança é de: R$ ".concat(String.valueOf(cp.getBalance())));






    }
}
