package task01;

public class Main {

    public static void main(String[] args) {
        AterioivaOtus opettaja = new Opettaja();
        AterioivaOtus oppilas = new Oppilas();
        AterioivaOtus kissa = new Kissa();
        opettaja.aterioi();
        oppilas.aterioi();
        kissa.aterioi();
    }
}
