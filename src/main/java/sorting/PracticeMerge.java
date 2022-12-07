package sorting;

import java.util.Arrays;

public class PracticeMerge {
    public static int[] divide(int[] integers) {
        if (integers.length == 1){
            return integers;
        }
        int mid = integers.length / 2;
        int[] first = new int[mid];
        int[] second = new int[integers.length - mid];

        int counter = 0;
        for (int i = 0; i < first.length; i++) {
            first[i] = integers[counter++];
        }
        for (int i = 0; i < second.length; i++) {
            second[i] = integers[counter++];
        }
        int[] firstArray = divide(first);
        int[] secondArray = divide(second);

        return merge(firstArray, secondArray);
    }
    public static int[] merge(int[] first, int[] second){
        int[] result = new int[first.length + second.length];
        int counterFirst = 0;
        int counterSecond = 0;
        int i = 0;
        for (; i < result.length; i++) {
            if (counterFirst < first.length && counterSecond < second.length){
                if (first[counterFirst] < second[counterSecond]){
                    result[i] = first[counterFirst++];
                }else{
                    result[i] = second[counterSecond++];
                }
            }else{
                break;
            }
        }
        if (counterFirst == first.length){
            while(counterSecond<second.length){
                result[i++] = second[counterSecond++];
            }
        }else{
            while(counterFirst<first.length){
                result[i++] = first[counterFirst++];
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] integers = {2,1,98,56,4,7,5,8};
        int[] merge = divide(integers);
        Arrays.stream(merge).forEach(System.out::println);
    }

}
