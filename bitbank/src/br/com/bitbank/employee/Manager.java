package br.com.bitbank.employee;

public class Manager extends Employee {
    private String department;

    @Override
    public String toString() {
        return "br.com.bitbank.employee.Manager{" +
                "department='" + department + '\'' +
                '}';
    }

    public Double getBonus(){
        return super.getBonus() + super.getSalary();
    }
}
