package task20_facade;

class Memory {
    private String data;
    void load(long position, String data) {
        this.data = data;
        // Simulating load operation
        System.out.printf("Loading data into memory \"%d\": %s\n", position, data);
    }

    public String getData(long position) {
        return data;
    }
}
