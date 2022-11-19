package features.thread;

public class Application {

    public static void main(String[] args) {

        Runnable sayHi = () -> System.out.println("Saying Hi!! from lambda");
        sayHi.run();
    }
}
