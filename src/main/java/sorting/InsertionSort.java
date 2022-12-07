package sorting;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class InsertionSort implements Sort {
    @Override
    public int[] sort(int[] integers) {
        Predicate<Integer> greaterThanOrEqualToZero = number -> number >= 0;
        for (int i = 1; i < integers.length; i++) {
            int temp = integers[i];
            Predicate<Integer> greaterThanTemp = number -> number > temp;
            int counter = i - 1;
            while(greaterThanOrEqualToZero.test(counter) &&  greaterThanTemp.test(integers[counter])){
                integers[counter + 1] = integers[counter];
                counter--;
            }
            integers[++counter] = temp;
        }
        return integers;
    }

    public static void main(String[] args) {
        int[] integers = {1,4,2,3,9,5};
        Sort insertionSort = new InsertionSort();
        int[] sort = insertionSort.sort(integers);
        Arrays.stream(sort).forEach(System.out::print);
    }
}



