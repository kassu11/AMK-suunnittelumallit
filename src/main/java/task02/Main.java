package task02;

import task02.Adidas.AdidasVaatteet;
import task02.Boss.BossVaatteet;

public class Main {
    public static void main(String[] args) {
        Ihminen jasper = new Jasper(new AdidasVaatteet());
        jasper.pueVaatteet();

        jasper.vaihdaBrandi(new BossVaatteet());
        jasper.pueVaatteet();
    }
}
