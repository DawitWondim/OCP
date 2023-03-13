
import java.lang.Thread;

public class WorkingWithThreads {
    public static void main(String [] args) {

        //Create a Thread and Execute a Task That Implements Runnable
        Task1 task1 = new Task1();
        Thread thread1 = new Thread(task1);
        thread1.start();

        //Create a Thread that extends the Thread class and override the run method.
        Thread2 thread2 = new Thread2();
        thread2.start();


    }


}

class Task1 implements Runnable {

    @Override
  public void run() {
        System.out.println("Executing task1");
    }
}

class Thread2 extends Thread {

    @Override
   public void  run() {
        System.out.println("Executing another task in Thread2");
    }
}