package study.java.self.lamda.app;

import java.util.function.Function;
import java.util.function.Predicate;

import study.java.self.lamda.util.StringUtil;

public class ReferenceMethodApp {
    public static void main(String[] args) {

        // Predicate<String> pred1 = new Predicate<String>() {
        //     @Override
        //     public boolean test(String t) {
        //         return StringUtil.isLowerCase(t);
        //     }
        // };

        // Predicate<String> pred2 = word -> StringUtil.isLowerCase(word);

        //Using Lambda Method Reference (Static)
        Predicate<String> pred = StringUtil::isLowerCase;

        System.out.println(pred.test("SAMPLE"));
        System.out.println(pred.test("Sample"));
        System.out.println(pred.test("sample"));

        //Using Parameter as Reference
        // Function<String, String> funcUpper = (String val) -> val.toUpperCase();
        Function<String, String> funcUpper = String::toUpperCase;
        System.out.println(funcUpper.apply("sample"));
    }

    public void run() {
        //Using Lambda Method Reference (Same in Class and not Static)
        Predicate<String> pred2 = this::isLowerCase;
        System.out.println(pred2.test("SAMPLE"));
        System.out.println(pred2.test("Sample"));
        System.out.println(pred2.test("sample"));
    }

    public void run2(){
        //Using Lambda Method Reference (Object)
        ReferenceMethodApp data = new ReferenceMethodApp();

        Predicate<String> pred3 = data::isLowerCase;
        System.out.println(pred3.test("SAMPLE"));
        System.out.println(pred3.test("Sample"));
        System.out.println(pred3.test("sample"));
    }

    public boolean isLowerCase(String word) {
        for(char c : word.toCharArray()){
            if(!Character.isLowerCase(c)){
                return false;
            }
        }
        return true;
    }
}
