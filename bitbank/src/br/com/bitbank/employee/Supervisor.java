package br.com.bitbank.employee;

public class Supervisor extends AuthenticableEmployee{
    @Override
    public Double getBonus() {
        return this.getSalary() / 3;
    }
}
