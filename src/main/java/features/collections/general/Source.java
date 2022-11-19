package features.collections.general;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Source {

    public static void main(String[] args) {

        int[] integers = {1,5,2,7};
        List<Integer> list = new ArrayList<>();
        List<Integer> myList = Arrays.asList(1, 3, 2);

        System.out.println(myList);
        Collections.sort(list);
        System.out.println(list);

    }
}
