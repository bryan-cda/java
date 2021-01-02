package br.com.jse.colletions;

public class Students {
    private String name;
    private String register;

    public Students(String name, String register) {
        this.name = name;
        this.register = register;
    }

    public Students() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRegister() {
        return register;
    }

    public void setRegister(String register) {
        this.register = register;
    }

    @Override
    public String toString() {
        return "Students{" +
                "name='" + name + '\'' +
                ", register='" + register + '\'' +
                '}';
    }
}
