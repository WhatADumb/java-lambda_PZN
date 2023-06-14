package study.java.self.lamda.app;

import java.util.function.Consumer;

public class ConsumerApp {
    public static void main(String[] args) {
        Consumer<Integer> consumer = (age) -> {
            System.out.println("My age is " + age + " years old");
        };

        consumer.accept(19);
    }
}
