package features.streams;

import java.util.Arrays;
import java.util.List;

public class Practice {
    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(1,2,3,4,5,6);

//        final int factor = 3;
        int[] factor = new int[]{3};
        Integer result = integers.stream()
                .filter(n -> n > factor[0])
                .filter(n -> n % 2 == 0)
                .map(n -> n * n)
                .findFirst()
                .orElse(0);

        factor[0] = 5;
        System.out.println("result = " + result);




    }
}
