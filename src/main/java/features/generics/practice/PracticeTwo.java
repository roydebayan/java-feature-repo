package features.generics.practice;

public class PracticeTwo {
    public <T> void function(T a, T b){
        System.out.println("The value of a is " + a);
        System.out.println("The value of b is " + b);
        System.out.println("Class name of the second object is " + b.getClass().getSimpleName());
        if (b.getClass().getSimpleName().equals("Student")){
            System.out.println("I know you are a student object");
            StudentOne student = (StudentOne) b;
            student.sayHi("Kabir");
        }
    }



    public static void main(String[] args) {

        PracticeTwo object = new PracticeTwo();
        object.function("Ron" , "India");
        object.function(3, 55);
        object.function("Norma", 44);
        object.function("David", new StudentOne());
        object.function("Nik", 33);
    }
}
class StudentOne{

    public void sayHi(String name){
        System.out.println("Saying Hi " + name + "!!");
    }

    @Override
    public String toString() {
        return "Student class";
    }
}
