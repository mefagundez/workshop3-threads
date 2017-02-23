package self.edu;


public class Main {


    public static void main(String[] args) throws Exception {

        System.out.println(" Runnable Thread Starting !!! ");
        MyRunnableThread rc = new MyRunnableThread();
        Thread t1 = new Thread(rc);
        t1.start();
        Thread.sleep(1000);
        Thread t2 = new Thread(rc);
        t2.start();
        Thread.sleep(1000);
        Thread t3 = new Thread(rc);
        t3.start();

        Thread.sleep(500);

        System.out.println(" Extended Thread Starting Implementation 1!!! ");
        MyExtendedThread tc1 = new MyExtendedThread();
        tc1.start();
        Thread.sleep(1000); // Waiting for 1 second before starting next thread
        MyExtendedThread tc2 = new MyExtendedThread();
        tc2.start();
        Thread.sleep(1000); // Waiting for 1 second before starting next thread
        MyExtendedThread tc3 = new MyExtendedThread();
        tc3.start();

        Thread.sleep(500);
        System.out.println(" Extended Thread Starting Implementation 2!!! ");
        MyExtendedThread ext = new MyExtendedThread();
        Thread tce1 = new Thread(ext);
        tce1.start();
        Thread.sleep(1000); // Waiting for 1 second before starting next thread
        Thread tce2 = new Thread(ext);
        tce2.start();
        Thread.sleep(1000); // Waiting for 1 second before starting next thread
        Thread tce3 = new Thread(ext);
        tce3.start();
    }
}
