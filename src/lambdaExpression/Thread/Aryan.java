package lambdaExpression.Thread;

public class Aryan implements Runnable{

    // Implementing the run method from Runnable interface

    @Override
    public void run()
    {
    for (int i=0;i<10;i++)
        {
            System.out.println("Aryan is running " + i);
            try {
                Thread.sleep(1000); // Sleep for 1 second
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
