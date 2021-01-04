package br.com.auction;

public class Offering {
    private User user;
    private Double value;

    public Offering(User user, Double value) {
        this.user = user;
        this.value = value;
    }

    public Offering() {
    }

    @Override
    public String toString() {
        return "Offering{" +
                "user='" + user + '\'' +
                ", value=" + value +
                '}';
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }
}
