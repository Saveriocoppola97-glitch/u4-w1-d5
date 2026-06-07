package entities;
// Attributi
public class Registrazione extends ElementoMultimediale {
  protected int durata;
  protected int volume;
// Costruttore
public Registrazione (int durata, int volume, String titoloElemento){
    super(titoloElemento);
    this.durata = durata;
    this.volume = volume;
}
// Getter 1
    public int getDurata() {
        return durata;
    }
// Setter 1
    public void setDurata(int durata) {
        this.durata = durata;
    }
// Getter 2
    public int getVolume() {
        return volume;
    }
    // Setter 2
    public void setVolume(int volume) {
        this.volume = volume;
    }
//    Metodi
    public void abbassaVolume() {
    if(volume > 0) {
       volume--;
    }
    }
    public void alzaVolume() {
    volume++;
    }

    @Override
    public void play() {
        String esclamativi = "!".repeat(Math.max(0, volume));
        for (int i = 0; i < durata; i++) {
            System.out.println(titoloElemento + " " + esclamativi);
        }
    }
}
