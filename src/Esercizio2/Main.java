package Esercizio2;

public class Main {
    public static void main(String[] args) {
        Sim sim1 = new Sim("3935987877");
        Sim sim2 = new Sim("3477661596");
        Chiamata chiamata1 = new Chiamata("222333443", 3.45);
        Chiamata chiamata2 = new Chiamata("222333443", 3.45);
        Chiamata chiamata3 = new Chiamata("222333443", 3.45);
        Chiamata chiamata4 = new Chiamata("222333443", 3.45);
        Chiamata chiamata5 = new Chiamata("222333443", 3.45);
        sim1.riempiChiamate(chiamata1, chiamata2, chiamata3, chiamata4, chiamata5);

        sim1.stampaSim();
        sim2.stampaSim();
    }
}
