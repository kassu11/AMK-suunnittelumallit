package task10;

public class CEO extends JobTitle {
    private String name = "CEO";

    public String handleRequest(int request) {
        return String.format("%s will handle the request", name);
    }
}
