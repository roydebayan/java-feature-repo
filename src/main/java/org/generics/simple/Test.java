package org.generics.simple;

import java.util.ArrayList;
import java.util.List;

public class Test {

    public static void main(String[] args) {

        List<Record<? extends One>> list = new ArrayList<>();
        One one = new One("Ron");
        Record<One> recordOne = new Record<>(one);
        Two two = new Two("Tommy");
        Record<Two> recordTwo = new Record<>(two);
        list.add(recordOne);
        list.add(recordTwo);
        for (Record<?> record : list) {
            System.out.println(record.genericObject);
        }

    }
}
