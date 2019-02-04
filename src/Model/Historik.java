package Model;

import java.time.LocalDateTime;

public class Historik {

    private int id;
    private Recept recept;
    private Användare användare;
    private LocalDateTime created;
    private LocalDateTime lastUpdate;

    Historik(int id, Recept recept, Användare användare, LocalDateTime created, LocalDateTime lastUpdate){
        this.id = id;
        this.recept = recept;
        this.användare = användare;
        this.created = created;
        this.lastUpdate = lastUpdate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Recept getRecept() {
        return recept;
    }

    public void setRecept(Recept recept) {
        this.recept = recept;
    }

    public Användare getAnvändare() {
        return användare;
    }

    public void setAnvändare(Användare användare) {
        this.användare = användare;
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
