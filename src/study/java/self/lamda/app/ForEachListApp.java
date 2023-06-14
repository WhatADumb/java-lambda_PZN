package study.java.self.lamda.app;

import java.util.List;
import java.util.function.Consumer;

public class ForEachListApp {
    public static void main(String[] args) {
        List<String> list = List.of("Data 1", "Data 2", "Data 3");

        //For i Loop 
        System.out.println("Loop with For(i)\n");
        for(String val : list){
            System.out.println(val);
        }

        //Anonymous class
        System.out.println("\nLoop with Anonymous class\n");
        list.forEach(new Consumer<String>() {
            public void accept(String t) {
                System.out.println(t);
            };
        });

        //Lambda
        System.out.println("\nLoop with Lambda\n");
        list.forEach((value) -> System.out.println(value));

        //Lambda Method Reference
        System.out.println("\nLoop with Lambda Method Reference\n");
        list.forEach(System.out::println);
    }
}
