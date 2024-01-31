package task03;

public class Main {
    public static void main(String[] args) {
        Komponentti muistipiiri = new KoneKomponentti("Muistipiiri", 50);
        Komponentti emolevy = new KoneKomposiitti("Emolevy", 100);
        Komponentti prosessori = new KoneKomponentti("Prosessori", 200);
        Komponentti verkkokortti = new KoneKomponentti("Verkkokortti", 30);
        Komponentti näytönohjain = new KoneKomponentti("Näytönohjain", 300);
        Komponentti kotelo = new KoneKomposiitti("Kotelo", 50);
        Komponentti virtalähde = new KoneKomponentti("Virtalähde", 50);
        Komponentti kovalevy = new KoneKomponentti("Kovalevy", 100);

        emolevy.lisääOsa(muistipiiri);
        emolevy.lisääOsa(prosessori);
        emolevy.lisääOsa(verkkokortti);
        emolevy.lisääOsa(näytönohjain);

        kotelo.lisääOsa(emolevy);
        kotelo.lisääOsa(virtalähde);
        kotelo.lisääOsa(kovalevy);

        System.out.println("Kokoonpanon hinta: " + kotelo.getHinta());
    }
}
