package Model;

import java.time.LocalDateTime;
import java.util.List;

public class Ingredienslista {

    private int id;
    private Recept recept;
    private List<Ingredienser> ingredienslista1;
    private LocalDateTime created;
    private LocalDateTime lastUpdate;

    Ingredienslista(int id, Recept recept, List<Ingredienser> ingredienslista1, LocalDateTime created, LocalDateTime lastUpdate){
        this.id = id;
        this.recept = recept;
        this.ingredienslista1 = ingredienslista1;
        this.created = created;
        this. lastUpdate = lastUpdate;
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

    public List<Ingredienser> getIngredienslista1() {
        return ingredienslista1;
    }

    public void setIngredienslista1(List<Ingredienser> ingredienslista1) {
        this.ingredienslista1 = ingredienslista1;
    }
}
