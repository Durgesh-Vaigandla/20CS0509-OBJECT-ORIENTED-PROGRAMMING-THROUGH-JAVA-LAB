/*EXP-7 Write a Java program that creates three threads. First thread displays ―Good Morning, every one second, the second thread displays Hello, every two seconds 
and the third thread displays Welcome every three seconds.
 */
public class GreetingThreads {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new GreetingRunnable("Good Morning", 1000));
        Thread thread2 = new Thread(new GreetingRunnable("Hello", 2000));
        Thread thread3 = new Thread(new GreetingRunnable("Welcome", 3000));

        thread1.start();
        thread2.start();
        thread3.start();
    }
}

class GreetingRunnable implements Runnable {
    private String greeting;
    private long interval;

    public GreetingRunnable(String greeting, long interval) {
        this.greeting = greeting;
        this.interval = interval;
    }

    @Override
    public void run() {
        try {
            while (true) {
                System.out.println(greeting);
                Thread.sleep(interval);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
