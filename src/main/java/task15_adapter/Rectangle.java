package task15_adapter;

public class Rectangle {
    private BinaryRectangle binaryRectangle;

    public Rectangle(BinaryRectangle binaryRectangle) {
        this.binaryRectangle = binaryRectangle;
    }

    public double getWidth() {
        return Integer.parseInt(binaryRectangle.getWidth(), 2);
    }

    public double getHeight() {
        return Integer.parseInt(binaryRectangle.getHeight(), 2);
    }

    public void setWidth(int width) {
        binaryRectangle.setWidth(Integer.toBinaryString(width));
    }

    public void setHeight(int height) {
        binaryRectangle.setHeight(Integer.toBinaryString(height));
    }

    public double getArea() {
        return Integer.parseInt(binaryRectangle.getArea(), 2);
    }
}
