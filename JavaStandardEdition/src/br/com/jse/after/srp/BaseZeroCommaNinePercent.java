package br.com.jse.after.srp;

public class BaseZeroCommaNinePercent implements Calculable {

    @Override
    public Double calc(Employee employee) {
        return employee.getSalary() * 0.9;
    }
}
