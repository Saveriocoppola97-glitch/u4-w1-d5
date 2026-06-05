package entities;
// ATTRIBUTI
public class ElementoMultimediale {
    protected String titoloCanzone;

// Costruttore
public ElementoMultimediale(String titoloCanzone) {
    this.titoloCanzone = titoloCanzone;
   }

// SETTER
    public void setTitoloCanzone(String titoloCanzone) {
        this.titoloCanzone = titoloCanzone;
    }

// GETTER
    public String getTitoloCanzone() {
        return titoloCanzone;
    }

// METODI
    public void play(){
    }
}
