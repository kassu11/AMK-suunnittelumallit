package task19_iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Test1 {
    public static void main(String[] args) {
        List<Double> numbers = new ArrayList<>();
        for(int i = 0; i < 100_000; i++) {
            numbers.add(Math.random());
        }

        // loop numbers inside thread
        Thread thread1 = new Thread(() -> {
            double sum = 0;
            System.out.println("Thread 1");
            for(Double number : numbers) {
                sum += number;
            }
            System.out.println("Thread 1 " + sum);
        });

        Thread thread2 = new Thread(() -> {
            double sum = 0;
            System.out.println("Thread 2");
            for(Double number : numbers) {
                sum += number;
            }
            System.out.println("Thread 2 " + sum);
        });

        Thread thread3 = new Thread(() -> {
            double sum = 0;
            Iterator<Double> iterator = numbers.iterator();
            System.out.println("Thread 2");
            while(iterator.hasNext()) {
                sum += iterator.next();
//                iterator.remove(); // This works, but because multiple thread are running, will cause an error.
            }
            System.out.println("Thread 2 " + sum);
        });

        thread1.start();
        thread2.start();
        thread3.start();
    }
}
