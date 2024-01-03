class MyThread extends Thread {

    String tname;
    public Mythread(String name){
        this.tname = name;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(tname+ " - Value: " + i);

            try {
                // Sleep for 1 second
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class Threadeg {
    public static void main(String[] args) {
        // Creating two threads
        MyThread thread1 = new MyThread("Thread 1");
        MyThread thread2 = new MyThread("Thread 2");

        // Starting the threads
        thread1.start();
        thread2.start();
    }
}
