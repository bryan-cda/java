package br.com.bitbank.terminal;

import br.com.bitbank.account.Account;
import br.com.bitbank.account.type.current.CurrentAccount;
import br.com.bitbank.account.type.savings.SavingAccount;
import br.com.bitbank.client.Client;

public class Terminal {
    public static void main(String[] args) {
        Account ACC_4526 = new CurrentAccount();

        ACC_4526.setBalance(2000);
        ACC_4526.setAgency(4888);
        ACC_4526.setAccountNumber(28774);

        Client Bryan = new Client();
        Bryan.setName("Bryan Duarte");
        Bryan.setAddress("Rua das Árvores, 12");
        Bryan.setCpf("111.222.333-02");
        Bryan.setTelephone("(11) 99817645");
        ACC_4526.setOwner(Bryan);

        System.out.println(ACC_4526.getBalance());
        System.out.println(ACC_4526.getAccountNumber());

        ACC_4526.deposit(200);

        System.out.println(ACC_4526.getBalance());

        ACC_4526.withdraw(200);

        System.out.println(ACC_4526.getBalance());

        System.out.println(ACC_4526.getClient().getName());
        System.out.println(ACC_4526.getClient().getCpf());
        System.out.println(ACC_4526.getAccountNumber());

        Account account = new SavingAccount();


    }
}
