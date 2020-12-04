package br.com.jse.after.srp;

public class TestSalary {
    public static void main(String[] args) {
        Employee jamie = new Developer();
        jamie.setSalary(4500D);
        jamie.setEmployeeType(EmployeeEnum.DEVELOPER);

        Employee julian = new Tester();
        julian.setSalary(3000D);
        julian.setEmployeeType(EmployeeEnum.TESTER);


        Employee cora = new DBA();
        cora.setSalary(3200D);
        cora.setEmployeeType(EmployeeEnum.DBA);

        System.out.println(jamie.getSalaryMoreBonus());
        System.out.println(julian.getSalaryMoreBonus());
        System.out.println(cora.getSalaryMoreBonus());


    }

}
