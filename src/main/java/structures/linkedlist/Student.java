package structures.linkedlist;

public class Student {
    String name;
    Student bestFriend;
    public Student(String name){
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }

    public static void main(String[] args) {
        Student ravi = new Student("Ravi");
        ravi.bestFriend = new Student("Molly");
        System.out.println("ravi.bestFriend: " + ravi.bestFriend);
        System.out.println("ravi.name: " + ravi.name);
        Student rav = ravi;
        System.out.println("rav.bestFriend: " + rav.bestFriend);
        System.out.println("rav.name: "+ rav.name);
        rav.bestFriend = new Student("Harry");
        System.out.println("rav.bestFriend: " + rav.bestFriend);
        System.out.println("ravi.bestFriend: " + ravi.bestFriend);
        rav = null;
//        System.out.println("rav.bestFriend: " + rav.bestFriend);
        System.out.println("ravi.bestFriend: " + ravi.bestFriend);
    }

}
