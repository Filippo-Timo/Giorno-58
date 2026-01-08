package Esercizio1;

public class Main {
    public static void main(String[] args) {
        Rettangolo ret1 = new Rettangolo(4.3, 2.3);
        Rettangolo ret2 = new Rettangolo(3.6, 7.2);

        Rettangolo.stampaRettangolo(ret1);
        Rettangolo.stampaRettangolo(ret2);

        Rettangolo.StampaDueRettangoli(ret1, ret2);
    }
}
