package features.generics.practice;

public class PracticeGenerics<T> {
    public T name;
    public T address;

    public PracticeGenerics(T name, T address) {
        this.name = name;
        this.address = address;
    }

    public T getName() {
        return name;
    }

    public T getAddress() {
        return address;
    }

    public static void main(String[] args) {
        PracticeGenerics<String> object = new PracticeGenerics<>("Debayan", "US");
        String value = object.getAddress();
        System.out.println("value = " + value);

    }
}
