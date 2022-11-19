package features.fp;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class FunctionClassTwo {

    public static void showInt(Integer integer){
        System.out.println("integer = " + integer);
    }

    public static void main(String[] args) {

        List<Integer> integers = Arrays.asList(1,3,2,4,7,6);

        Predicate<Integer> predicate = (n) -> n > 4;
        Predicate<Integer> isGreaterThan3 = (n) -> n > 3;

        Function<Integer, Predicate<Integer>> isGreaterThan = pivot -> n -> {
            System.out.println("Line One");
            System.out.println("Line Two");
            n = n + 1;
            return n > 3;
        };
        boolean test = predicate.test(5);
        System.out.println("test = " + test);

        List<Integer> collect = integers.stream().filter(isGreaterThan.apply(3)).collect(Collectors.toList());
        integers.forEach((n) -> System.out.println("Hi" + n));
        Predicate<String> predicateTwo = (n) -> n.equals("MayBe");
        System.out.println("collect = " + collect);
    }
}
