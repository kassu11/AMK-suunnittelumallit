package task03;

import java.util.ArrayList;
import java.util.List;

public class KoneKomponentti implements Komponentti {
    private double hinta;
    private String nimi;

    public KoneKomponentti(String nimi, double hinta) {
        this.nimi = nimi;
        this.hinta = hinta;
    }

    public double getHinta() {
        return hinta;
    }

    public void lisääOsa(Komponentti osa) {
        System.out.println("Ei voi lisätä osaa!");
    }

    public String getNimi() {
        return nimi;
    }
}
