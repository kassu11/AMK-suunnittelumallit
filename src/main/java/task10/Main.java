package task10;

public class Main {
    public static void main(String[] args) {
        CEO ceo = new CEO();
        Supervisor supervisor = new Supervisor();
        Manager manager = new Manager();
        Employee employee = new Employee();

        manager.setSuccessor(ceo);
        supervisor.setSuccessor(manager);
        employee.setSuccessor(supervisor);

        System.out.println(employee.handleRequest(1));
        System.out.println(employee.handleRequest(3));
        System.out.println(employee.handleRequest(6));
        System.out.println(employee.handleRequest(9));
    }
}
