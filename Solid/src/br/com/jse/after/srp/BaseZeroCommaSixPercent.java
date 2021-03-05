package br.com.jse.after.srp;

public class BaseZeroCommaSixPercent implements Calculable {
    @Override
    public Double calc(br.com.jse.after.srp.Employee employee) {
        return employee.getSalary() * 0.6;
    }
}
