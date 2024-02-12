package task06;

import java.util.Scanner;

public class SensitiveData extends DataDecorator {
    private String password;

    public SensitiveData(Data data, String password) {
        super(data);
        this.password = password;
    }
    public String getData() {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a password to get sensitive data: ");
        String password = scanner.nextLine();

        if (password.equals(this.password)) {
            System.out.println("Correct password!");
            return super.getData();
        } else {
            System.out.println("Incorrect password!");
            return "Access denied!";
        }
    }
}
