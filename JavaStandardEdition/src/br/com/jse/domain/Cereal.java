package br.com.jse.domain;

public class Cereal implements Edible{
    private String name;

    public Cereal() {
    }

    public Cereal(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Cereal{" +
                "name='" + name + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
