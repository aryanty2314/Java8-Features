package lambdaExpression;

//lambda expression replaces the anonymous class completely
// it is a more concise way to implement functional interfaces
public class myClass
{
    public static void main(String[] args) {
        startLambdaExpression s = (name) -> System.out.println("Name : "+name);
        s.start();
        s.name("John Doe");
        // static method can be called without an instance
        // but it is better to call it with the interface name
        // as it is a static method
        startLambdaExpression.fullName();
    }
}
