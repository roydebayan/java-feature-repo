package sorting;

import java.util.Arrays;
import java.util.function.Function;
import java.util.function.Predicate;

public class MergeSort {
    public static int[] merge(int[] A, int[] B){
        Predicate<Integer> aIsDone = value -> value == A.length-1;
        Predicate<Integer> bIsDone = value -> value == B.length-1;
        int[] result = new int[A.length + B.length];
        int pointerA = 0;
        int pointerB = 0;
        boolean itsB = true;
        int i = 0;
        for (i = 0; i < result.length; i++) {
            if (A[pointerA] <= B[pointerB]){
                result[i] = A[pointerA];
                if (aIsDone.test(pointerA)){
                    itsB = false;
                    break;
                }
                else pointerA++;
            }else{
                result[i] = B[pointerB];
                if (bIsDone.test(pointerB))
                    break;
                else
                    pointerB++;
            }
        }
        if (itsB){
            for (int j = ++pointerB; bIsDone.test(j); j++) {
                result[i] = B[pointerB++];
                i++;
            }
        }else{
            for (int j = ++pointerA; aIsDone.test(j); j++) {
                result[i] = A[pointerA++];
                i++;
            }
        }
        return result;
    }

    public static void main(String[] args) {

        int[] first = {2,4};
        int[] second = {1,3,5,6,7};
//        Predicate<Integer> bIsDone = value -> value == first.length-1;
//        boolean test = bIsDone.test(1);
//        System.out.println("test = " + test);
        int[] merge = merge(first, second);
        Arrays.stream(merge).forEach(System.out::print);
        
    }
}
