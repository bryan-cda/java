package br.com.jse.collections;

public class Classes implements Comparable<Classes> {

    private String name;
    private Integer time;

    @Override
    public String toString() {
        return "Classes{" +
                "name='" + name + '\'' +
                ", time=" + time +
                '}';
    }

    public Classes(String name, Integer time) {
        this.name = name;
        this.time = time;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getTime() {
        return time;
    }

    public void setTime(Integer time) {
        this.time = time;
    }

    @Override
    public int compareTo(Classes o) {
        return this.name.compareTo(o.getName());
    }
}
