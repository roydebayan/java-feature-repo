package features.fp;

import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Application {
    public static void main(String[] args) {
        List<String> strings = List.of("One", "Two", "Three");
        List<Integer> integers = List.of(1,2,3,4,5);

        Predicate<Integer> predicate = integer -> {
            return integer == 10;
        };
        boolean test = predicate.test(10);
        System.out.println("test = " + test);
        boolean testOne = predicate.test(15);
        System.out.println("testOne = " + testOne);


    }
}
