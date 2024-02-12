package task06;

public abstract class DataDecorator implements Data {
    private Data data;

    public DataDecorator(Data data) {
        this.data = data;
    }
    public String getData() {
        return data.getData();
    }
}
