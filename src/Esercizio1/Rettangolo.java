package Esercizio1;

public class Rettangolo {

    // ******************** ATTRIBUTI DI ISTANZA ********************
    private double altezza;
    private double larghezza;


    // ******************** COSTRUTTORE ********************
    public Rettangolo(double altezza, double larghezza) {
        this.altezza = altezza;
        this.larghezza = larghezza;
    }

    public static void stampaRettangolo(Rettangolo ret) {
        System.out.println("Perimetro del rettangolo: " + ret.getPerimetro());
        System.out.println("Area del rettangolo: " + ret.getArea());
    }

    public static void StampaDueRettangoli(Rettangolo ret1, Rettangolo ret2) {
        System.out.println("Rettangolo 1:");
        Rettangolo.stampaRettangolo(ret1);
        System.out.println("Rettangolo 2:");
        Rettangolo.stampaRettangolo(ret2);
        double sumArea = ret1.getArea() + ret2.getArea();
        double sumPerimetro = ret1.getPerimetro() + ret2.getPerimetro();
        System.out.println("Somma delle aree " + sumArea);
        System.out.println("Somma delle perimetro " + sumPerimetro);
    }

    // ******************** METODI ********************
    public double getPerimetro() {
        return (altezza + larghezza) * 2;
    }

    public double getArea() {
        return larghezza * altezza;
    }

    // ******************** GETTER ********************
    public double getAltezza() {
        return altezza;
    }

    // ******************** SETTER ********************
    public void setAltezza(double altezza) {
        this.altezza = altezza;
    }

    public double getLarghezza() {
        return larghezza;
    }

    public void setLarghezza(double larghezza) {
        this.larghezza = larghezza;
    }

}
