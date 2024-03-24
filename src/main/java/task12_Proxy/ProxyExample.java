package task12_Proxy;

import java.util.ArrayList;
import java.util.List;

public class ProxyExample {
    public static void main(final String[] arguments) {
        Image[] imageFolder = new Image[]{
            new ProxyImage("HiRes_10MB_Photo1"),
            new ProxyImage("HiRes_10MB_Photo2"),
            new ProxyImage("HiRes_10MB_Photo3"),
            new ProxyImage("HiRes_10MB_Photo4")
        };

        for(Image image : imageFolder) {
            image.showData();
        }

        System.out.println("-----");

        for(Image image : imageFolder) {
            image.displayImage();
        }
    }
}
