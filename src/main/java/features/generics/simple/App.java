package features.generics.simple;

import java.sql.ResultSet;

public class App<T> {
    T t;

    public App(T t) {
        this.t = t;
    }

    public void sayClassName(){
        System.out.println(t.getClass().getSimpleName());
    }

    public T returnType() {
        return t;
    }
}

class First {
    public String string;

    public First(String string) {
        this.string = string;
    }

    public String toString() {
        return this.string;
    }
}
class Second {
    public String string;

    public Second(String string) {
        this.string = string;
    }

    public String toString() {
        return this.string;
    }
}

class Driver {
    public static void main(String[] args) {
        App<Integer> appOne = new App<>(33);
        appOne.sayClassName();
        ResultSet resultSet;
    }
}
