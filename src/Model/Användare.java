package Model;

import java.time.LocalDateTime;

public class Användare {

    private int id;
    private String name;
    private String password;
    private boolean vego;
    private LocalDateTime created;
    private LocalDateTime lastUpdate;
    private int antalPersoner;

    Användare(int id, String name, String password, boolean vego, LocalDateTime created, LocalDateTime lastUpdate, int antalPersoner){
        this.id = id;
        this.name = name;
        this.password = password;
        this.vego = vego;
        this.setCreated(created);
        this.setLastUpdate(lastUpdate);
        this.antalPersoner = antalPersoner;
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

    public boolean isVego() {
        return vego;
    }

    public void setVego(boolean vego) {
        this.vego = vego;
    }



    public int getAntalPersoner() {
        return antalPersoner;
    }

    public void setAntalPersoner(int antalPersoner) {
        this.antalPersoner = antalPersoner;
    }

    public LocalDateTime getCreated() {
        return created;
    }

    public void setCreated(LocalDateTime created) {
        this.created = created;
    }

    public LocalDateTime getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(LocalDateTime lastUpdate) {
        this.lastUpdate = lastUpdate;
    }
}
