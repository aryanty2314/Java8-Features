package lambdaExpression.Thread;

public class main
{
    public static void main(String[] args) {
        // Using a lambda expression to create a Runnable instance
        // and override the run method
        // This is a more concise way to implement the Runnable interface
        // without creating a separate class
        // The lambda expression is passed to the Thread constructor
        // and the run method is executed when the thread starts
        // Note: Using thread.run() will not start a new thread, it will just call the run method in the current thread

        Runnable r = ()->
        {
          for (int i = 1; i < 11; i++)
          {
                System.out.println("Aryan is running " + i+ " hours");
                try {
                    Thread.sleep(1000); // Sleep for 1 second
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
          }
        };
        Thread thread = new Thread(r);
        thread.run();
    }
}
