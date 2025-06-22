package lambdaExpression.Learning;

public class main
{
    public static void main(String[] args)
    {
        // Using a lambda expression to implement the Employee interface
        // and provide the implementation for the name method.
        Employee employee = ()-> "software engineer";
        System.out.println(employee.name());
        System.out.println(employee.age(30));
    }
}
