package dao;

public class Firm {
    private int id;
    private String name;

    public Firm() {
    }

    public Firm(String name) {
        this(0, name);
    }

    public Firm(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Firm [id=" + id + ", name=" + name + "]";
    }
}