package features.generics.simple;

public class One {
    private final String name;

    public One(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }
}
