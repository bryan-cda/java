package br.com.bitbank.employee;

public class BankOperator extends Employee{
    @Override
    public Double getBonus() {
        return  getSalary() * 0.5;
    }

    @Override
    public String toString() {
        return "BankOperator{} " + super.toString();
    }
}
