package task02.Boss;

import task02.AbstractFactory.Hattu;
import task02.AbstractFactory.Housut;
import task02.AbstractFactory.Kengät;
import task02.AbstractFactory.Paita;
import task02.BrandiFactory;

public class BossVaatteet implements BrandiFactory {
    public Hattu createHattu() {
        return new BossHattu();
    }

    public Paita createPaita() {
        return new BossPaita();
    }

    public Housut createHousut() {
        return new BossHousut();
    }

    public Kengät createKengät() {
        return new BossKengät();
    }
}
