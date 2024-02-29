package task10;

public class Manager extends JobTitle {
    private int cutOff = 5;
    private String name = "Manager";

    public String handleRequest(int request) {
        if (request <= cutOff) {
            return String.format("%s will handle the request", name);
        } else {
            return super.handleRequest(request);
        }
    }
}
