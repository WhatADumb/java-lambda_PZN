package study.java.self.lamda.app;

import java.util.Map;
import java.util.function.BiConsumer;

public class ForEachMapApp {
    public static void main(String[] args) {
        Map<String, String> map = Map.of("key-1", "data1", "key-2", "data2", "key-3", "data3");

        //For i loop
        System.out.println("For(i) Loop");
        for(var data : map.entrySet()){
            System.out.println(data.getKey() + " : " + data.getValue());
        }

        //Anonymous Class
        System.out.println("\nLoop With Anonymous Class");
        map.forEach(new BiConsumer<String, String>() {
            @Override
            public void accept(String t, String u) {
                System.out.println(t + " : " + u);
            }
        });

        //Lambda
        System.out.println("\nLoop With Lambda");
        map.forEach((key, value) -> System.out.println(key + " : " + value));
    }
}
