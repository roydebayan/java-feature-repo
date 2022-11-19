package features.collections.sort;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Application implements Comparable<Application> {
    private final int id;

    public Application(int id) {
        this.id = id;
    }
    public int getId(){
        return this.id;
    }

    @Override
    public String toString() {
        return String.valueOf(this.id);
    }

    @Override
    public int compareTo(Application otherApp) {
//        if (this.getId() > otherApp.getId()){
//            return 33;
//        }else {
//            return -9;
//        }
        return this.getId() - otherApp.getId();
    }
    public static void main(String[] args) {
        Application appOne = new Application(55);
        Application appTwo = new Application(22);
//        Application appThree = new Application(88);
        List<Application> list = Arrays.asList(appOne, appTwo);
        System.out.println("Before sorting: " + list);
        Collections.sort(list);
        System.out.println("After sorting: " + list);

    }


}
