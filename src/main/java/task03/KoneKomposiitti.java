package task03;

import java.util.ArrayList;
import java.util.List;

public class KoneKomposiitti implements Komponentti {
    private List<Komponentti> osat = new ArrayList<>();
    private double hinta;
    private String nimi;

    public KoneKomposiitti(String nimi, double hinta) {
        this.nimi = nimi;
        this.hinta = hinta;
    }

    public double getHinta() {
        double koosteHinta = hinta;
        for (Komponentti osa : osat) {
            koosteHinta += osa.getHinta();
        }
        return koosteHinta;
    }

    public void lisääOsa(Komponentti osa) {
        osat.add(osa);
    }

    public String getNimi() {
        return nimi;
    }
}
