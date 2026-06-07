import entities.Registrazione;
import entities.Img;

public class Main {
    public static void main(String[] args) {
//        COSRUTTORE UTILIZZATO
        Registrazione uno = new Registrazione(+2, 10, "Thriller Brano di Michael Jackson ‧ 1982");
        System.out.println("INIZIO IMG");
        Img img1 = new Img("dog",5);

        // IMMAGINE
        img1.show();
        System.out.println("Aumento la luminosità");
        img1.aumentoLuminosit();
        img1.show();
        System.out.println("Adesso diminuisco");
        img1.diminuiscoLuminosit();
        img1.show();
        System.out.println("FINE IMG");

        //REGISTRAZIONE
        System.out.println("RIPRODUZIONE INIZIATA");
        uno.play();
        System.out.println("Abbasso il volume e riproduco ANCORA");
        uno.abbassaVolume();
        uno.play();
        System.out.println("RIPRODUZIONE TERMINATA");
    }
}