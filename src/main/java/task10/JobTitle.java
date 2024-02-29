package task10;

public class JobTitle {
    private JobTitle successor;

    public void setSuccessor(JobTitle successor) {
        this.successor = successor;
    }

    public String handleRequest(int request) {
        if (successor != null) {
            return successor.handleRequest(request);
        }
        return null;
    }
}
