package task02;

import task02.AbstractFactory.Housut;
import task02.AbstractFactory.Hattu;
import task02.AbstractFactory.Paita;
import task02.AbstractFactory.Kengät;

public interface BrandiFactory {
    public Housut createHousut();
    public Hattu createHattu();
    public Paita createPaita();
    public Kengät createKengät();
}
