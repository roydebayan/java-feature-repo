package features.fp;

import java.util.Arrays;
import java.util.List;

public class Simple {
    public static String sayHiTo(String name){
        return "Hi";
    }

    public static void show(String string){
        System.out.println("Showing name " + string);
    }

    public static void main(String[] args) {

//        List<Integer> integers = Arrays.asList(1,2,3);
//        integers.forEach(System.out::println);
//        integers.forEach(Simple::show);
//        List<Integer> collect = integers.stream().filter(i -> i > 1).collect(Collectors.toList());
//        System.out.println(collect);

        List<String> names = Arrays.asList("Ron", "Harry", "Hermione");
        for (int i = 0; i < names.size(); i++) {
            System.out.println("Hi "+ names.get(i));
        }

        for (String name : names) {
            System.out.println("Hi " + name);
        }

        names.forEach(System.out::println);
        names.forEach(Simple::show);


    }
}
