package recursion;

import structures.linkedlist.LinkList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Practice {
    public String longestCommonPrefix(String[] strs) {
        String pivot = strs[0];
        for (int i = 1; i < strs.length; i++) {
            while(strs[i].indexOf(pivot) != 0){
                pivot = pivot.substring(0,pivot.length() - 1);
            }
        }
        return pivot;
    }
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        int result = 5/2;
        System.out.println("result = " + result);
        int two = 6/2;
        System.out.println("two = " + two);


    }
}
