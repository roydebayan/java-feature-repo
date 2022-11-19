package features.generics.lex;

public class Hosteler implements Student{

    private String name;
    public Hosteler(String name){
        this.name = name;
    }

    @Override
    public void sayHello() {
        System.out.println("Hello From Hosteler");
    }

    @Override
    public String getName() {
        return "Hosteler: " + this.name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }


}
