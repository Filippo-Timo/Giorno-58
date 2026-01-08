package Esercizio2;

import java.util.Arrays;

public class Sim {

    //ATTRIBUTI
    private String numeroDiTelefono;
    private double credito = 0.0;
    private Chiamata[] ultimeChiamate = new Chiamata[5];


    //COSTRUTTORE
    public Sim(String numeroDiTelefono) {
        this.numeroDiTelefono = numeroDiTelefono;
        this.credito = credito;
    }

    //METODI
    public void stampaSim() {
        System.out.println("Questa è la sim: ");
        System.out.println("Numero: " + numeroDiTelefono);
        System.out.println("Credito: " + credito);
        System.out.println("Elenco ultime chiamate: " + Arrays.toString(ultimeChiamate));
    }

    public void riempiChiamate(Chiamata chiamata1, Chiamata chiamata2, Chiamata chiamata3, Chiamata chiamata4, Chiamata chiamata5) {
        ultimeChiamate = new Chiamata[5];
        ultimeChiamate[0] = chiamata1;
        ultimeChiamate[1] = chiamata2;
        ultimeChiamate[2] = chiamata3;
        ultimeChiamate[3] = chiamata4;
        ultimeChiamate[4] = chiamata5;
    }

    //GETTER
    public String getNumeroDiTelefono() {
        return numeroDiTelefono;
    }


}
