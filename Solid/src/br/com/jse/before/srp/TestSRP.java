package br.com.jse.before.srp;

public class TestSRP {
    public static void main(String[] args) {
        Employee emp = new Employee("Bryan", 0001, "Duarte", "Rua A", "bryan.duarte@ig.com", "(21) 1111-2222", EmployeeEnum.TESTER, 7250D);
        emp.salaryAdjustment(2900D);
        System.out.println(emp.getSalary());

    }
}
