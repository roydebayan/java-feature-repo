package sorting;

import java.util.Arrays;

public class SelectionSort {

    public static int[] sort(int[] integers, int length){
        for (int i = 0; i < length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < length; j++) {
                if (integers[minIndex] > integers[j]) minIndex = j;
            }
            if (integers[i] > integers[minIndex]){
                int temp = integers[minIndex];
                integers[minIndex] = integers[i];
                integers[i] = temp;
            }
        }
        return integers;
    }

    public static void main(String[] args) {
        int[] integers = {2,4,1,7,6,8,7};
        int[] sortedIntegers = sort(integers, integers.length);
        Arrays.stream(sortedIntegers).forEach(System.out::println);
    }
}
