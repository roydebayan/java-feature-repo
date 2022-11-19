package features.fp;

import java.util.function.Function;
import java.util.function.Predicate;

public class FunctionClass {
    
    public static Predicate<String> function(String string){
        Predicate<String> result = value -> value.equals(string);
        return result;
    }

    public static void main(String[] args) {
        Function<Integer, Predicate<Integer>> function = pivot -> integer -> integer > pivot;

        Function<String, Predicate<String>> myFunction = pivot -> string -> string.trim().equals(pivot);

        myFunction.apply("Ronald");
        boolean test = function("David").test("David");
        System.out.println("test = " + test);

    }
}
