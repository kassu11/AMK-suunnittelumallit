package task06;

public class PublicData extends DataDecorator {
    public PublicData(Data data) {
        super(data);
    }
    public String getData() {
        System.out.println("Getting public data...");
        return super.getData();
    }
}
