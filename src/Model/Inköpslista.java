package Model;

import java.time.LocalDateTime;

public class Inköpslista {

    private int id;
    private Recept recept;
    private Ingredienslista ingredienslista;
    private LocalDateTime created;
    private LocalDateTime lastUpdate;

    Inköpslista(int id, Recept recept, Ingredienslista ingredienslista, LocalDateTime created, LocalDateTime lastUpdate){
        this.id = id;
        this.recept = recept;
        this.ingredienslista = ingredienslista;
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

    public Ingredienslista getIngredienslista() {
        return ingredienslista;
    }

    public void setIngredienslista(Ingredienslista ingredienslista) {
        this.ingredienslista = ingredienslista;
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
