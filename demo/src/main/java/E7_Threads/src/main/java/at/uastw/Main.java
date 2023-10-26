package E7_Threads.src.main.java.at.uastw;


public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Tasks tasks = new Tasks();


        //Package the fucntions into Runnables
      Runnable r1 = new Runnable() {
          @Override
          public void run() {
              tasks.task1();
          }
      };

      Runnable r2 = new Runnable() {
          @Override
          public void run() {
              tasks.task2();
          }
      };


      //create new Threads
      Thread t1 = new Thread(r1);
      Thread t2 = new Thread(r2);

      //start the threads in paralell mode
      t1.start();
      t2.start();

      try {
          t1.join();
          t2.join();
      }catch (InterruptedException e){
          System.out.println("Something went Wrong :(");
      }

        System.out.println("Finished");

    }

    /*
     Diese Klasse dürfen Sie nicht verändern.
     */
    public static class Tasks {

        /*
        Simuliert eine Aufgabe, die 6 Sekunden dauert.
         */


        public void task1() {
            System.out.println("Start von Task 1");
            try {
                Thread.sleep(6000);
            } catch (InterruptedException e) {
                // ignored
            }
            System.out.println("Task 1 beendet");
        }

        /*
        Simuliert eine Aufgabe, die 8 Sekunden dauert.
         */
        public void task2() {
            System.out.println("Start von Task 2");
            try {
                Thread.sleep(8000);
            } catch (InterruptedException e) {
                // ignored
            }
            System.out.println("Task 2 beendet");
        }
    }
}

