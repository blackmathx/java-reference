import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;



public class h_Threads {

    public static void run() {
        System.out.println("\n=== Threads =================\n");


        DoSomething doSth = new DoSomething("One"); // instance of class implementing runnable
        Thread newDS = new Thread(doSth); 			// create a new thread
        newDS.start();								// call the threads start method

        DoMore doMore = new DoMore("Two");
        Thread newDM = new Thread(doMore);
        newDM.start();

        System.out.println("Main still running");


        // interrupt a running thread
        boolean bInterrupt = false;
        try {
            for(int i = 0; i < 10; i++) {
                if(i == 3  && bInterrupt) {
                    // notify a thread to clean up and terminate
                    newDS.interrupt();
                }
                System.out.println("main");
                Thread.sleep(2000);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }



        boolean altExample = false;
        if(altExample) {
            // Alternate Thread Example (Extend the Thread class)
            // Expensive to construct many separate threads though or on resource constrained device.
            // Runnable interface is equating to a sequence of statements rather than making a thread.
            // Possible to overcome this by using thread pools
            Thread thr = new VariationOnThread();
            thr.start();
        }


        boolean threadPools = true;
        if(threadPools) {
            // Thread Pools. Threads are managed by the OS so many short lived threads can
            // be created from a thread pool. Add a Runnable object to a thread pool and the
            // next available thread executes the run method.
            final int MAX_THREADS = 5;
            Runnable r1 = new DoSomething("x");
            Runnable r2 = new DoSomething("y");
            ExecutorService pool = Executors.newFixedThreadPool(MAX_THREADS);
            pool.execute(r1);
            pool.execute(r2);
            // If too many threads then some are placed in a queue.
            // This is useful for server programs, instead of new thread for each request they are submitted to a pool
        }
    }
}




class DoSomething implements Runnable {
    String name;

    public DoSomething(String name){
        this.name = name;
    }
    public void run() {

        // Surround the whole run() method with a try/catch,
        // otherwise you cannot get the threads attention
        try {
            System.out.println("Starting doSomething...  " + name);
            for(int i = 0; i < 18; i++) {
                // Can also check !Thread.interrupted();
                System.out.println("doSomething...  " + name);
                Thread.sleep(700);
            }
        } catch (InterruptedException e) {
            // Do any cleanup here
            e.printStackTrace();
        }
    }
}


class DoMore implements Runnable {
    String name;

    public DoMore(String name){
        this.name = name;
    }

    public void run() {
        System.out.println("Starting doMore...  " + name);
        try {
            for(int i = 0; i < 33; i++) {
                System.out.println("doMore...  " + name);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class VariationOnThread extends Thread {
    public void run() {
        for(int i = 0; i < 10; i++) {
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("extends thread");
        }
    }
}
