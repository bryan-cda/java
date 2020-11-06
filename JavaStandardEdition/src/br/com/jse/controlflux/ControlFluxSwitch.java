package br.com.jse.controlflux;

public class ControlFluxSwitch {
    public static void main(String[] args) {
        System.out.println(calculateSalary(6));
    }

    public static int calculateSalary(int daysWork){
        int paymentDay = 50;
        int salary = 0;
        switch (daysWork){
            case 1:
                salary = paymentDay;
                break;
            case 2:
                salary += paymentDay * 2;
                break;
            case 3:
                salary += paymentDay * 3;
                break;
            case 4:
                salary += paymentDay * 4;
            case 5:
                salary += paymentDay * 5;
                break;
            default:
                System.out.println("payment threshold reached!");
        }

        return salary;
    }

}
