package lambdaExpression.anonymousVsLambda;

public class mainssss
{
    public static void main(String[] args) {

        /*
        when we have more than one abstract method inside our interface
        we use of anonymous inner-class
        */

        Employee employee = new Employee() {

            @Override
            public String getDesignation() {
                return "Java Developer";
            }

            @Override
            public String getName() {
                return "Aryan Tyagi";
            }
        };
        System.out.println(employee.getDesignation());
        System.out.println(employee.getName());
    }
}
