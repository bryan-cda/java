package br.com.jse.colletions;

public class IDE {
    private String name;
    private String brand;

    public IDE(String name, String brand) {
        this.name = name;
        this.brand = brand;
    }

    public IDE() {
    }

    @Override
    public String toString() {
        return "IDE{" +
                "name='" + name + '\'' +
                ", brand='" + brand + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}
