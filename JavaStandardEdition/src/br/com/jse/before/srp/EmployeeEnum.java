package br.com.jse.before.srp;

public enum EmployeeEnum {

    DEVELOPER("Developer"),
    DBA("DBA"),
    TESTER("Tester");

    public String employeeType;

    EmployeeEnum(String employeeType){
        this.employeeType = employeeType;
    }

    public String getEmployeeType() {
        return employeeType;
    }

}
