package study.java.self.lamda.app;

import java.util.function.Supplier;

public class SupplierApp {
    public static void main(String[] args) {
        Supplier<Float> sup = ()-> 3.14F;
        System.out.println(sup.get());
    }
}
