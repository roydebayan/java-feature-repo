package collections;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapWorkout {
    public static void main(String[] args) {
        Map<String, String> myMap = new HashMap<>();
        myMap.put("One", "Rahul");
        myMap.put("Two", "David");
        myMap.put("Three", "Kris");
        myMap.put("Four", "Marlon");
//        if (myMap.containsKey("Four")) System.out.println(myMap.get("Four"));
        myMap.forEach((key,value) -> System.out.println("Key: " + key + " Value: " + value));

        Map<Integer,String> map = new TreeMap<>();


    }
}
