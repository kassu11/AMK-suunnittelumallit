package task18_prototype;

public class Kello implements Cloneable {
    private Viisari sekuntti = new Viisari();
    private Viisari minuutti = new Viisari();
    private Viisari tunti = new Viisari();

    public Kello(int tunti, int minuutti, int sekuntti) {
        this.sekuntti.setAika(tunti);
        this.minuutti.setAika(minuutti);
        this.tunti.setAika(sekuntti);
    }

    public void setAika(int tunti, int minuutti, int sekuntti) {
        this.tunti.setAika(tunti);
        this.minuutti.setAika(minuutti);
        this.sekuntti.setAika(sekuntti);
    }

    public Object clone() {
        Kello klooni = null;
        try {
            klooni = (Kello) super.clone();
            klooni.sekuntti = (Viisari) sekuntti.clone();
            klooni.minuutti = (Viisari) minuutti.clone();
            klooni.tunti = (Viisari) tunti.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return klooni;
    }

    public Object ShallowClone() {
        Kello klooni = null;
        try {
            klooni = (Kello) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return klooni;
    }

    public String toString() {
        return tunti + ":" + minuutti + ":" + sekuntti;
    }
}
