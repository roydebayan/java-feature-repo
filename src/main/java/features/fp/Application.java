package features.fp;

import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Application {
    public static void main(String[] args) {
//        List<String> strings = List.of("One", "Two", "Three");
//        List<Integer> integers = List.of(1,2,3,4,5);
//
//        Predicate<Integer> predicate = integer -> {
//            return integer == 10;
//        };
//        boolean test = predicate.test(10);
//        System.out.println("test = " + test);
//        boolean testOne = predicate.test(15);
//        System.out.println("testOne = " + testOne);
        List<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        System.out.println(list);
        list.add(3);
        System.out.println("list = " + list);
        Integer integer = 3;
        int i = list.indexOf(integer);
        System.out.println("i = " + i);
        Function<Integer, Predicate<Integer>> isNumber = pivot -> n -> Objects.equals(n, pivot);
        Predicate<Integer> isThree = n -> n == 3;
        list.removeIf(isNumber.apply(2));
//        list.remove(integer);
        System.out.println("list = " + list);


    }
}
