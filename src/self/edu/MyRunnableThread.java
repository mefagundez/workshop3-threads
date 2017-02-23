package self.edu;

public class MyRunnableThread implements Runnable {

    public int basicIntCount = 0;
    public Integer classIntCount = 0;
    private static final ThreadLocal<Integer> threadId = new ThreadLocal<Integer>()
    {
        @Override
        protected Integer initialValue()
        {
            return 0;
        }
    };

    public MyRunnableThread(){
    }

    public void run() {
        System.out.println("Counter in Runnable basic! -> " + (basicIntCount++));
        System.out.println("Counter in Runnable class Int! -> " + (classIntCount++));
        threadId.set(threadId.get() + 1);
        System.out.println("Counter in Runnable ThreadLocal Int! -> " + (threadId.get()));
    }
}
