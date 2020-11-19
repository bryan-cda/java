package br.com.bitbank.employee;


public class Manager extends AuthenticableEmployee {
    private String department;

    @Override
    public String toString() {
        return "Manager{" +
                "department='" + department + '\'' +
                "} " + super.toString();
    }

    @Override
    public Double getBonus() {
        return this.getSalary() / 2;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
