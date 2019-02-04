package Model;

import java.time.LocalDateTime;

public class Kategori {

    private int id;
    private String name;
    private LocalDateTime created;
    private LocalDateTime lastUpate;

    Kategori(int id, String name, LocalDateTime created, LocalDateTime lastUpate){
        this.id = id;
        this.name = name;
        this.created = created;
        this.lastUpate = lastUpate;
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

    public LocalDateTime getCreated() {
        return created;
    }

    public void setCreated(LocalDateTime created) {
        this.created = created;
    }

    public LocalDateTime getLastUpate() {
        return lastUpate;
    }

    public void setLastUpate(LocalDateTime lastUpate) {
        this.lastUpate = lastUpate;
    }
}
