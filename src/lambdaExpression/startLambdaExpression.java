package lambdaExpression;

public interface startLambdaExpression
{
    void name(String name);

    default void start()
    {
        System.out.println("start");
    }

    static void fullName()
    {
        System.out.println("fullName: ");
    }
}
