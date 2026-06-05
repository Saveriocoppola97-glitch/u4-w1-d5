package entities;
// Attributi
public class Registrazione extends ElementoMultimediale {
  protected int durata;
  protected int volume;
// Costruttore
public Registrazione (int durata, int volume, String titoloCanzone){
    super(titoloCanzone);
    this.durata = durata;
    this.volume = volume;
}
// Metodi
    public int getDurata() {
        return durata;
    }

    public void setDurata(int durata) {
        this.durata = durata;
    }

    public int getVolume() {
        return volume;
    }
    public void setVolume(int volume) {
        this.volume = volume;
    }

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
            System.out.println(titoloCanzone + " " + esclamativi);
        }
    }
}
