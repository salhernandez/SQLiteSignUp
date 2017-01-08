package test.sqliteloginsignup;

/**
 * Created by chava on 1/8/2017.
 */

public class List {

    private int id;
    private String name;

    public List() {}

    public List(String name) {
        this.name = name;
    }

    public List(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
