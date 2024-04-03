package task15_adapter;

public class Main {
    public static void main(String[] args) {
        Point point = new Point(1, 2); //                   0           0           5           5
        BinaryRectangle binaryRectangle = new BinaryRectangle("00000", "00000", "00101", "00101");

        Rectangle rectangleAdapter = new Rectangle(binaryRectangle);
        System.out.println("Area of point: " + point.getArea());
        System.out.println("Area of binary rectangle: " + binaryRectangle.getArea());
        binaryRectangle.setWidth("00001");
        System.out.println("Area of binary rectangle: " + binaryRectangle.getArea());
        rectangleAdapter.setHeight(1);
        System.out.println("Area of rectangle: " + rectangleAdapter.getArea());
    }
}
