package concurency_threads.thread;


import static concurency_threads.thread.ThreadColor.ANSI_BLUE;

public class AnotherThread extends Thread {

    @Override
    public void run() {
        System.out.println(ANSI_BLUE + "Hello from another thread." + currentThread().getName());
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            System.out.println(ANSI_BLUE + "Anothre thread woke me up");
            return;
        }
        System.out.println(ANSI_BLUE + "Three seconds have passed i'm awake");
    }
}
