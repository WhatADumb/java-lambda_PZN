package study.java.self.lamda.app;

import study.java.self.lamda.SimpleAction;

public class SimpleActionApp {
    public static void main(String[] args) {
        // //Without Lambda
        // SimpleAction data1 = new SimpleAction() {
        //     @Override
        //     public String action() {
        //         return "This is Data 1";
        //     }
        // };
        // System.out.println(data1.action());

        // //With Lambda
        // SimpleAction data2 = () -> {
        //     return "This is Data 2";
        // };
        // System.out.println(data2.action());

        SimpleAction data1 = (String name) -> {
            return "This is " + name;
        };

        SimpleAction data2 = (value) -> {
            return "This is " + value;
        };

        SimpleAction data3 = (String name) -> "Hello " + name;
        SimpleAction data4 = (name) -> "Hello There " + name;
        SimpleAction data5 = name -> "Hello There, " + name;
    }
}
