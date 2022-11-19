package features.thread;

public class RunnableImpl implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello World");
            try {
                Thread.sleep(1000);
                String name = Thread.currentThread().getName();
                System.out.println("Current thread name = " + name);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
