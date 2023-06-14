package study.java.self.lamda.app;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class RemoveIfApp {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.addAll(List.of("Alpha", "Beta", "Celeron", "Delta"));

        //Anonymous Class
        System.out.println("Remove If with Anonymous Class");
        list.removeIf(new Predicate<String>() {
            @Override
            public boolean test(String t) {
                return t.length() > 5;
            }
        });
        System.out.println(list);

        //Lambda
        System.out.println("\nRemove If with Lambda");
        list.removeIf((data) -> (data.length() > 5));
        System.out.println(list);
    }
}
