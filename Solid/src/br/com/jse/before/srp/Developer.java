package br.com.jse.before.srp;

public class Developer extends Employee {
    private String workRegime;

    public Developer(String firstName, Integer code, String lastName, String address, String email, String telephone, EmployeeEnum employeeType, Double salary) {
        super(firstName, code, lastName, address, email, telephone, employeeType, salary);
    }

    public String getWorkRegime() {
        return workRegime;
    }

    public void setWorkRegime(String workRegime) {
        this.workRegime = workRegime;
    }
}
