package entities;
// ATTRIBUTI
public class ElementoMultimediale {
    protected String titoloElemento;

// Costruttore
public ElementoMultimediale(String titoloElemento) {
    this.titoloElemento = titoloElemento;
   }

// SETTER
    public void setTitoloElemento(String titoloElemento) {
        this.titoloElemento = titoloElemento;
    }

// GETTER
    public String getTitoloElemento() {
        return titoloElemento;
    }

// METODI
    public void play(){
    }
    public void show(){
    }
}
