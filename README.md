# Workshop 3 (Threads)

### What you need to have installed:

- Java 8

### How to run the application

    javac -d . Main.java MyExtendedThread.java MyRunnableThread.java
    java self.edu.Main

### Theory

- **In  Core Java  build examples of threading implementing the interface Runnable vs inheriting from Thread. What is the difference and why it is important?. Which you consider a better approach for the REST API development context?. Show example**

    - The main difference is caused for the Java design. It doesn’t allow multiple inheritance so if you need to inherit some information from a class different than thread you can not use Thread but you would be forced to use the Runnable Interface. Also from a OOP point of view, in the vast majority of cases it would be incorrect to extend the Thread class since we are not extending the class and we don’t want to create a highly-coupled class. This is one of the most important points to use the Runnable interface because it leads to a loosely coupled architecture. Since In rest APIs we are looking for the best architecture and loosely coupling, the Runnable interface would be my recommendation. Also as the extending Thread implementation requires to instance a new object for a new thread, its worth noting that it would make the internal variables to not be shared unless they are static (This could change the decision up to what is needed in the implementation). Further reference in the code. About the thread locals variable implemented by java, it ensures that the variable is thread safe so each thread get its own copy. There is a lot of reference to being used with a common non-thread-safe class as SimpleFormatterDate. Further reference in the code.