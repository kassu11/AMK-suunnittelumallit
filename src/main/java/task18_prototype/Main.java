package task18_prototype;

public class Main {
    public static void main(String[] args) {
        Kello kello = new Kello(12, 0, 0);
        Kello klooni = (Kello) kello.clone();
        Kello huonoKlooni = (Kello) kello.ShallowClone();
        klooni.setAika(13, 30, 10);
        huonoKlooni.setAika(11, 22, 33);
        System.out.println(kello);
        System.out.println(klooni);
        System.out.println(huonoKlooni);
    }
}
