package study.java.self.lamda.app;

import java.util.function.Supplier;

public class LazyApp {
    public static void main(String[] args) {
        testScore(-99, () -> getName());
    }

    public static void testScore(int grade, Supplier<String> name) {
        if(grade > 85){
            System.out.println("Selamat " + name.get() + ", Anda Lulus");
        }else{
            System.out.println("Maaf, anda tidak lulus");
        }
    }

    public static String getName(){
        System.out.println("invoke getName()");
        return "Adi";
    }
}
