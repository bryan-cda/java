package br.com.jse.after.srp;

public class Employee {
    private String firstName;
    private Integer code;
    private String lastName;
    private String address;
    private String email;
    private String telephone;
    private EmployeeEnum employeeType;
    private Double salary;


    public Employee(String firstName, Integer code, String lastName, String address, String email, String telephone, EmployeeEnum employeeType, Double salary) {
        this.firstName = firstName;
        this.code = code;
        this.lastName = lastName;
        this.address = address;
        this.email = email;
        this.telephone = telephone;
        this.employeeType = employeeType;
        this.salary = salary;
    }

    public Employee() {
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public EmployeeEnum getEmployeeType() {
        return employeeType;
    }

    public void setEmployeeType(EmployeeEnum employeeType) {
        this.employeeType = employeeType;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public Double getSalaryMoreBonus(){
        return this.getEmployeeType().calculable.calc(this);
    }
}
