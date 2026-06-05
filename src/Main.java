import entities.Registrazione;

public class Main {
    public static void main(String[] args) {
        Registrazione uno = new Registrazione(+2, 10, "Thriller Brano di Michael Jackson ‧ 1982");

        System.out.println("RIPRODUZIONE INIZIATA");
        uno.play();
        System.out.println("Abbasso il volume e RIPRODUCO ancora");
        uno.abbassaVolume();
        uno.play();
    }
}