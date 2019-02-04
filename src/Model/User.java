package Model;

public class User {
    private int id;
    private String name;
    private String password;
    private int clearence;

    public User(int id, String name, String password, int clearence) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.clearence = clearence;
    }

    public int getId() {
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getClearence() {
        return clearence;
    }

    public void setClearence(int clearence) {
        this.clearence = clearence;
    }
}
