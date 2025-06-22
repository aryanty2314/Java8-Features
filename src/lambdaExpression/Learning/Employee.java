package lambdaExpression.Learning;

@FunctionalInterface
public interface Employee
{
String name();
default int age(int age)
{
    return age;
}
}
