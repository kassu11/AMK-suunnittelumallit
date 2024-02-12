package task06;

public class GenericData implements Data {
    private String data;

    public GenericData(String data) {
        this.data = data;
    }
    public String getData() {
        System.out.println("Getting generic data...");
        return data;
    }
}
