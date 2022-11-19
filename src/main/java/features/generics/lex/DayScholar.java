package features.generics.lex;

public class DayScholar implements Student{

    private String name;
    public DayScholar(String name){
        this.name = name;
    }
    @Override
    public void sayHello() {
        System.out.println("Hello from DayScholar");
    }

    @Override
    public String getName() {
        return "DayScholar: " + this.name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }
}
