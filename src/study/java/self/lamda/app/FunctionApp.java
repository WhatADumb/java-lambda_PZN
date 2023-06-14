package study.java.self.lamda.app;

import java.util.function.Function;

public class FunctionApp {
    public static void main(String[] args) {
        Function<String, Integer> func = (name) -> name.length();
        System.out.println(func.apply("Logitech"));
    }
}
