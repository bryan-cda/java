package br.com.jse.after.srp;


public class BaseZeroCommaFivePercent implements Calculable {
    @Override
    public Double calc(Employee employee) {
        return employee.getSalary() * 0.5;
    }
}
