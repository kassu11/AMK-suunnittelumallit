package task09;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        ListConverter lineBreakAfterOne = new LineBreaker(new LineBreakAfterOne());
        ListConverter lineBreakAfterTwo = new LineBreaker(new LineBreakAfterTwo());
        ListConverter lineBreakAfterThree = new LineBreaker(new LineBreakAfterThree());

        List<String> words = List.of(" one", " two", " three", " four", " five", " six", " seven", " eight", " nine");

        System.out.println(lineBreakAfterOne.listToString(words));
        System.out.println("-----");
        System.out.println(lineBreakAfterTwo.listToString(words));
        System.out.println("-----");
        System.out.println(lineBreakAfterThree.listToString(words));
    }
}
