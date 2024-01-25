package task02;

public class Jasper implements Ihminen {
    private BrandiFactory brandi;

    public Jasper(BrandiFactory brandi) {
        this.brandi = brandi;
    }

    public void pueVaatteet() {
        System.out.println(this);
    }

    public void vaihdaBrandi(BrandiFactory brandi) {
        this.brandi = brandi;
    }

    public String toString() {
        return "Jasperilla on päällään: \n" + brandi.createPaita() + "\n" + brandi.createHousut() + "\n" + brandi.createHattu() + "\n" + brandi.createKengät() + "\n";
    }
}
