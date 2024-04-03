package task15_adapter;

public class BinaryRectangle {
    private String x, y, width, height;

    public BinaryRectangle(String x, String y, String width, String height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    public String getWidth() {
        return width;
    }

    public String getHeight() {
        return height;
    }

    public void setWidth(String width) {
        this.width = width;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getArea() {
        int w = Integer.parseInt(width, 2);
        int h = Integer.parseInt(height, 2);
        return Integer.toBinaryString(w * h);
    }
}
