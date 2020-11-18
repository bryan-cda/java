package br.com.bitbank.employee;

public class Employee {
    private String name;
    private String cpf;
    private Double salary;

    @Override
    public String toString() {
        return "br.com.bitbank.employee.Employee{" +
                "name='" + name + '\'' +
                ", cpf='" + cpf + '\'' +
                ", salary=" + salary +
                '}';
    }

    public Double getBonus(){
        return salary * 0.5;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }
}
