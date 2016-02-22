package Threads;

/**
 * Created by Sergi1 on 22/02/2016.
 */
public class Principal {

    public static void main(String[] args) throws InterruptedException{

        runnable r = new runnable();
        thread1 thread = new thread1();
        r.run();
        thread.start();
        //r.join();
        thread.join();
    }

}

