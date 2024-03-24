package task13_visitor;

import task13_visitor.pokemons.Pokemon;
import task13_visitor.visitors.BonusXpVisitor;
import task13_visitor.visitors.IVisitor;

public class Main {
    public static void main(String[] args) {
        Pokemon poke = new Pokemon();
        IVisitor bonusXpVisitor = new BonusXpVisitor();

        while (poke.getXp() < 2000) {
            boolean isCriticalHit = Math.random() < 0.5;
            poke.attack();
            if(isCriticalHit) poke.accept(bonusXpVisitor);
        }
    }
}
