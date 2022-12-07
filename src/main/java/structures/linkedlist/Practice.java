package structures.linkedlist;

public class Practice {
    
    public static void function(String name){
        name = "Molly";
    }

    public static Teacher getTeacher(String name){
        return new Teacher(name);
    }

    public static void printName(Teacher teacher){
        System.out.println("Teacher Name: " + teacher.name);
    }
    public static void functionTwo(Teacher teacher){
//        Teacher jenny = new Teacher("Jenny");
    }

    public static void main(String[] args) {
        String name = "Sam";
        function(name);
        System.out.println(name);
        Teacher teacher = new Teacher("Paul");
        System.out.println("Teacher Name " + teacher.name);
        functionTwo(teacher);
        System.out.println("Teacher Name " + teacher.name);
        printName(teacher);
        printName(new Teacher("Howard"));
        printName(getTeacher("Robert"));
    }
}

class Teacher{
    String name;
    public Teacher(String name){
        this.name = name;
    }
}

