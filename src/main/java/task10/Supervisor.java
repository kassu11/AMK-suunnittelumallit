package task10;

public class Supervisor extends JobTitle {
    private int cutOff = 2;
    private String name = "Supervisor";

    public String handleRequest(int request) {
        if (request <= cutOff) {
            return String.format("%s will handle the request", name);
        } else {
            return super.handleRequest(request);
        }
    }
}
