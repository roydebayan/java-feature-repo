package org.fp;

import java.util.function.Function;
import java.util.function.Predicate;

public class LoginClass {
    
    public static boolean matchName(String name, String target){
        return name.equals(target);
    }
    

    public static void main(String[] args) {
        boolean b = matchName("David", "David");
        System.out.println("b = " + b);
        boolean b1 = matchName("Simon", "Sally");
        System.out.println("b1 = " + b1);

        System.out.println("*********************** Predicate Login Below ***************************");
        Predicate<String> predicate = string -> string.equals("David");
        boolean valueOne = predicate.test("David");
        System.out.println("david = " + valueOne);
        boolean miller = predicate.test("Miller");
        System.out.println("miller = " + miller);

        Function<String, Predicate<String>> function = pivot -> string -> string.equals(pivot);
        boolean test = function.apply("David").test("David");
        System.out.println("test = " + test);


    }
}
