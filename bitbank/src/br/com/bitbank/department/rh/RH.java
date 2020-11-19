package br.com.bitbank.department.rh;

import br.com.bitbank.employee.BankOperator;
import br.com.bitbank.employee.Employee;
import br.com.bitbank.employee.Manager;
import br.com.bitbank.employee.Supervisor;

public class RH {
    public static void main(String[] args) {
        Employee bank_operator = new BankOperator();
        bank_operator.setName("John Due");
        bank_operator.setSalary(3800.0);
        bank_operator.setCpf("123.456.789-02");
        System.out.println(bank_operator.toString());
        System.out.println("Bonus: "+ bank_operator.getBonus());
        System.out.println("Total month: "+(bank_operator.getSalary() + bank_operator.getBonus()));

        System.out.println("________________________");

        Manager project_manager = new Manager();
        project_manager.setName("Don Trump");
        project_manager.setSalary(5000.0);
        project_manager.setCpf("333.555.777-02");
        project_manager.setDepartment("Sales");
        System.out.println(project_manager.toString());
        System.out.println("Bonus: "+ project_manager.getBonus());
        System.out.println("Total month: "+(project_manager.getSalary() + project_manager.getBonus()));
        System.out.println(project_manager.auth("q1w2e3")  ? "user logged on" : "Authentication error");

        System.out.println("________________________");


        Supervisor supervisor = new Supervisor();
        supervisor.setName("Joe Bin");
        supervisor.setSalary(4500.0);
        supervisor.setCpf("44.654.346-02");
        System.out.println(supervisor.toString());
        System.out.println("Bonus: "+ supervisor.getBonus());
        System.out.println("Total month: "+(supervisor.getSalary() + project_manager.getBonus()));
        System.out.println(supervisor.auth("q1w2e4") ? "User logged on" : "Authentication error");




        Payment payment = new Payment();
        System.out.println(payment.getBonus(bank_operator));
        System.out.println(payment.getBonus(project_manager));


    }
}
