package org.collections.general;

import java.util.*;

public class Application {
    public static void main(String[] args) {
        int[] integers = {1, 4, 2, 3};
        List<Integer> integerArray = Arrays.asList(1, 4, 2, 4);
        int[] some = new int[5];
        List<String> strings = List.of("One", "two", "Three");
        for (String string : strings) {
            System.out.println("string = " + string);
        }
        ArrayList<String> companies = new ArrayList<>();
        companies.add("IBM");
        companies.add("Google");
        companies.add("Infosys");
        System.out.println("companies = " + companies);

        Collections.sort(companies);
        Collections.reverse(companies);
        Collections.shuffle(companies);
        System.out.println("companies = " + companies);
        Collections.swap(companies,1,2);

        System.out.println(companies);
// Output: [Google, IBM, Infosys]

    }

}
