package task18_prototype;

public class Viisari implements Cloneable {
    private int aika;

    public void setAika(int aika) {
        this.aika = aika;
    }

    public Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }

    public String toString() {
        return String.format("%02d", aika);
    }
}
