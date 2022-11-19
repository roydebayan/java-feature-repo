package features.generics.lex;

import java.util.ArrayList;
import java.util.List;

public class Data {

    static List<Record<?>> list = new ArrayList<>();

    static {
        list.add(new Record<Student>(1, new Hosteler("Mark")));
        list.add(new Record<Student>(2, new DayScholar("Jerry")));
        list.add(new Record<String>(3, "Rohan"));
    }

    public static Record<?> getRecord(int index){
        return list.get(index);
    }

    public static void insertRecord(Record<?> record) {
        list.add(record);
    }

    public static void updateRecord(Record<?> record) {
        int id = record.getId();
        for (int i = 0; i < list.size(); i++) {
            if (i == id - 1) {
                list.set(i, record);
                break;
            }
        }
    }

    public static void showAll() {
        for (Record<?> record : list) {
            if (record.getType().getClass().getSimpleName().equals("Hosteler") || record.getType().getClass().getSimpleName().equals("DayScholar")) {
                Student type = (Student) record.getType();
                System.out.println(record.getId() + " " + "Student: " + type.getName());
            } else {
                System.out.println(record.getId() + " " + record.getType() + " " + record.getType().getClass().getSimpleName());
            }
        }
        System.out.println(" ");
    }
}
