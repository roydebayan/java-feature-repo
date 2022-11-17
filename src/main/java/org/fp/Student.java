package org.fp;

import java.util.function.Predicate;

@FunctionalInterface
public interface Student<T,R> {
    R apply(T t);
}
class Driver{
    public static void main(String[] args) {

        Student<Integer, String> student = String::valueOf;
        Predicate<String> predicate = string -> true;
        boolean david = predicate.test("David");
        System.out.println("david = " + david);


    }
}