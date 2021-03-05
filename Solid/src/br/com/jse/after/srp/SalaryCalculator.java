package br.com.jse.after.srp;

public class SalaryCalculator {
    public Double salary(Employee employee){
      return employee.getEmployeeType().getCalc().calc(employee);
    }
}
