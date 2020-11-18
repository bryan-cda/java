package br.com.bitbank.department.rh;

import br.com.bitbank.employee.BankOperator;
import br.com.bitbank.employee.Employee;
import br.com.bitbank.employee.Manager;

public class RH {
    public static void main(String[] args) {
        Employee bank_operator = new BankOperator();
        bank_operator.setName("John Due");
        bank_operator.setSalary(3800.0);
        bank_operator.setCpf("123.456.789-02");
        System.out.println(bank_operator.toString());

        Employee project_manager = new Manager();
        project_manager.setName("Foo bar");
        project_manager.setSalary(5000.0);
        project_manager.setCpf("333.555.777-02");


        Payment payment = new Payment();
        System.out.println(payment.getBonus(bank_operator));
        System.out.println(payment.getBonus(project_manager));


    }
}
