package task06;

public class Main {
    public static void main(String[] args) {
        Data publicData = new PublicData(new GenericData("This data doesn't need a password"));
        Data sensitiveData = new SensitiveData(new GenericData("This data needs a password"), "password");

        System.out.println(publicData.getData());
        System.out.println();
        System.out.println(sensitiveData.getData());
    }
}
