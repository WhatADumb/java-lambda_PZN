package study.java.self.lamda.app;

import java.util.function.Predicate;

public class PredicatedApp {
    public static void main(String[] args) {
        Predicate<String> pred = (value) -> value.isBlank();
        System.out.println(pred.test("Bob"));
        System.out.println(pred.test(""));
        
    }
}
