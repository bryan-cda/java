package br.com.bitbank.employee;

public class BankOperator extends Employee{
    @Override
    public Double getBonus() {
        return this.getBonus() + this.getSalary();
    }
}
