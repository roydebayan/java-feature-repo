package features.lambdas;

import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

@FunctionalInterface
public interface Application {
    String getValue();
}

@FunctionalInterface
interface Message{
    void say(String name);
}

class Blue{
    public static void greet(String name, String message){
        System.out.println(message +" "+ name);
    }
    
    
    public static void main(String[] args) {
        
//        Message greet = (name) -> System.out.println("Hello "+ name);
//        greet.say("Ron");
//
//        Message welcome = name -> System.out.println("Welcome "+name);
//        welcome.say("Randy");
//        welcome.say("Ken");
//        Function<String, Predicate<String>> function = pivot -> name -> name.equals(pivot);
//        Predicate<String> don = function.apply("Don");
//        boolean don1 = don.test("Don");
//        System.out.println("don1 = " + don1);
        List<String> strings = List.of("Ron", "Harry", "Mike", "Mandy", "Michael","Ravi", "Howard");
        Function<String, Predicate<String>> startsWith = pivot -> name -> name.startsWith(pivot);
        List<String> h = strings.stream().filter(startsWith.apply("M")).collect(Collectors.toList());
        h.forEach(System.out::println);

    }

}
