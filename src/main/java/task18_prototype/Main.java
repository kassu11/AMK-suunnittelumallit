package task18_prototype;

public class Main {
    public static void main(String[] args) {
        Kello kello = new Kello(12, 0, 0);
        Kello klooni = (Kello) kello.clone();
        klooni.setAika(13, 30, 10);
        System.out.println(kello);
        System.out.println(klooni);
    }
}
