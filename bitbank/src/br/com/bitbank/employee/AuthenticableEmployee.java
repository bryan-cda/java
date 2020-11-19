package br.com.bitbank.employee;

public abstract class AuthenticableEmployee extends Employee{
    public Boolean auth(String password){
        Boolean loggedIn = false;
        if(password.equalsIgnoreCase("q1w2e3")) {
            loggedIn = true;
        }
        return loggedIn;
    }
}
