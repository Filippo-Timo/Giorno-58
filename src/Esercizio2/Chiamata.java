package Esercizio2;

public class Chiamata {

    //ATTRIBUTI
    private String numeroTelefonico;
    private double durataChiamata;


    //COSTRUTTORE
    public Chiamata(String numeroTelefonico, double durataChiamata) {
        this.numeroTelefonico = numeroTelefonico;
        this.durataChiamata = durataChiamata;
    }


    //GETTER
    public String getNumeroTelefonico() {
        return numeroTelefonico;
    }

    public double getDurataChiamata() {
        return durataChiamata;
    }

    @Override
    public String toString() {
        return "Chiamata{" +
                "numeroTelefonico= " + numeroTelefonico + '\'' +
                ", durataChiamata= " + durataChiamata +
                '}';
    }
}
