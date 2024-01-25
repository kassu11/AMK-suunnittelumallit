package task02.Adidas;

import task02.AbstractFactory.Hattu;
import task02.AbstractFactory.Housut;
import task02.AbstractFactory.Kengät;
import task02.AbstractFactory.Paita;
import task02.BrandiFactory;

public class AdidasVaatteet implements BrandiFactory {
    public Housut createHousut() {
        return new AdidasHousut();
    }

    public Hattu createHattu() {
        return new AdidasHattu();
    }

    public Paita createPaita() {
        return new AdidasPaita();
    }

    public Kengät createKengät() {
        return new AdidasKengät();
    }
}
