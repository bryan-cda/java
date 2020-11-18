package br.com.bitbank.account;

import br.com.bitbank.client.Client;

public abstract class Account {
    private double balance;
    private int agency;
    private int accountNumber;
    private Client client;

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public int getAgency() {
        return agency;
    }

    public void setAgency(int agency) {
        this.agency = agency;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public Client getClient() {
        return client;
    }

    public void setOwner(Client client) {
        this.client = client;
    }

    public void deposit(double value){
        this.balance += value;
    }

    public boolean withdraw(double value){
        if(balance >= value){
            balance = balance - value;
            return true;
        } else{
            return false;
        }
    }

    public void transfer(double value, Account account){
        if(this.balance >= value){
            this.balance = this.balance - value;
            account.deposit(value);
        }
    }
}
