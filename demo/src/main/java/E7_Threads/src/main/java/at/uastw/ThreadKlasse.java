package E7_Threads.src.main.java.at.uastw;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

class Implementierung {
    public static void main(String[] args) throws InterruptedException {
        ThreadKlasse thread = new ThreadKlasse();
        thread.setName("Franz");
        thread.start();
        System.out.println("Der Thread heißt: " + thread.getName());
        System.out.println("Der Thread hat die ID : " + thread.getId());
        thread.join();
        System.out.println("Der Thread hat den Zustand: " + thread.getState());
        System.out.println("Das Ergebnis ist: " + thread.result);

// geben Sie hier die result Variable aus, die der Thread generiert hat

    }
}
class ThreadKlasse extends Thread {
    int result = 0;
    @Override
    public void run() {
        Date date = new Date();
        SimpleDateFormat format = new SimpleDateFormat("HH:mm:ss.SSS ");
                System.out.println("Starting Thread " + this.getName() + "at " + format.format(date));
        try {
            Random time = new Random();
            sleep(time.nextInt(5000));
            result = time.nextInt();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Date newdate = new Date();
        long elapsed = newdate.getTime() - date.getTime();
        System.out.println("Thread " + this.getName() + " exited after " + elapsed + " ms");
    }
}