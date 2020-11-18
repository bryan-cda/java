package br.com.bitbank.client;

public class Client {
    private String name;
    private String cpf;
    private String telephone;
    private String address;

    public Client(String name, String cpf, String telephone, String address) {
        this.name = name;
        this.cpf = cpf;
        this.telephone = telephone;
        this.address = address;
    }

    public Client() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}

