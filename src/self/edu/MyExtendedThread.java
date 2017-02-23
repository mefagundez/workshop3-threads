package self.edu;

public class MyExtendedThread extends Thread {

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

    public MyExtendedThread(){

    }
    public void run() {
        System.out.println("Counter in Thread basic Int! -> " + (basicIntCount++));
        System.out.println("Counter in Thread class Int! -> " + (classIntCount++));
        threadId.set(threadId.get() + 1);
        System.out.println("Counter in Thread ThreadLocal Int! -> " + (threadId.get()));
    }
}
