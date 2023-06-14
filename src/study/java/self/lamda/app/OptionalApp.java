package study.java.self.lamda.app;

import java.util.Optional;

public class OptionalApp {
    public static void main(String[] args) {
        greet("Daffa");
        greet(null);
    }

    public static void greet(String name) {
        //with if

        // if(name != null){
        //     String upper = name.toUpperCase();
        //     System.out.println(name);
        // }

        // //Optional Class

        // Optional<String> optName = Optional.ofNullable(name);
        // Optional<String> upperName = optName.map((data) -> data.toUpperCase());
        // upperName.ifPresent((data) -> System.out.println("HELLO " + data));

        // //Optional ifPresentElse
        
        // Optional.ofNullable(name)
        //     .map(String::toUpperCase)
        //         .ifPresentOrElse(
        //             val -> System.out.println("HELLO " + val),
        //             () -> System.out.println("HELLO THERE")
        //         );

        String tempName = Optional.ofNullable(name).map(String::toUpperCase)
            .orElse("BUDDY");
        System.out.println("HELLO " + tempName);
    }
}
