package br.com.jse.before.srp;

public class SalaryCalculator {
    public Double salary(Employee employee){
        Double salary =  null;
        if(EmployeeEnum.TESTER.equals(employee.getEmployeeType())){
            salary = baseZeroCommaFivePercent(employee);
        } else if(EmployeeEnum.DBA.equals(employee.getEmployeeType())){
            salary = baseZeroCommaNinePercent(employee);
        } else if(EmployeeEnum.DEVELOPER.equals(employee.getEmployeeType())){
            salary = baseZeroCommaSixPercent(employee);
        }
        return salary;
    }

    private Double baseZeroCommaSixPercent(Employee employee) {
        return employee.getSalary() * 0.6;
    }

    private Double baseZeroCommaNinePercent(Employee employee) {
        return employee.getSalary() * 0.9;
    }

    private Double baseZeroCommaFivePercent(Employee employee) {
        return employee.getSalary() * 0.5;
    }




}
