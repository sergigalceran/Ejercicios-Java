package Threads;

/**
 * Created by Sergi1 on 22/02/2016.
 */
public class runnable implements Runnable {

    //@Override
    public void run() {
        Thread thread = Thread.currentThread();
        long lastExecution = 0;
        int i=0;
        int tiempo = 0;
        while(i<10)
        {
            long currentExecution = System.currentTimeMillis();
            long elapsed = (lastExecution == 0) ? 0 : currentExecution - lastExecution;
            lastExecution = currentExecution;
            System.out.println(thread.getName() + " elapsed = " + elapsed + " ms. [" + (++tiempo) + "]");
            long pausa = (long) (Math.random() * 2000);
            i++;
            try {
                Thread.sleep(pausa);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}