package entities;
// Attributi
public class Img extends ElementoMultimediale {
    protected int luminosit;

// Costruttore
    public Img(String titoloElemento, int luminosit){
        super(titoloElemento);
        this.luminosit = luminosit;
    }

    //    Setter
    public void setLuminosit(int luminosit) {
        this.luminosit = luminosit;
    }

    //    Getter
    public int getLuminosit() {
        return luminosit;
    }

    // Metodo X Aumentare
    public void aumentoLuminosit(){
        this.luminosit++;
    }

//    Metodo x Diminuire
    public void diminuiscoLuminosit() {
        if (this.luminosit > 0) {
            this.luminosit--;
        }
    }
//     METODO ASTERISCHi
    @Override
    public void show() {
        StringBuilder asterischi = new StringBuilder();
        asterischi.repeat("*", Math.max(0, this.luminosit));
            System.out.println(this.getTitoloElemento() + " " + asterischi);
    }
}

