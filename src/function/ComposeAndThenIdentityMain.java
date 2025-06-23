package function;

import java.util.function.Function;

public class ComposeAndThenIdentityMain
{
    public static void main(String[] args) {

        // Example of a Function that takes a String and returns its length
        // Using the function to convert a string to uppercase
        Function<String,String> function1 = s-> s.toUpperCase();

        // This Function takes a String as input and returns another String (the uppercase version of the input)
        Function<String,String> function2 = s-> s.substring(0,3);
        // Chaining functions using andThen
        // The first function will be applied, and then the result will be passed to the second function
        // In this case, it will convert the string to uppercase and then take the first three characters
        // The result will be the first three characters of the uppercase string
        // For example, if the input is "Aryan", the output will be "ARY"
        System.out.println(function1.andThen(function2).apply("Aryan"));

//--------------------------------------------------------------------------------------------------------------------

        // This Function takes an Integer as input and returns another Integer (the square of the input multiplied by 2)
        // For example, if the input is 3, the output will be 18 (3*3*2)
        Function<Integer,Integer> function3 = (x)->x*x*2;

        Function<Integer,Integer> function4 = (x)->x+2;

        // Chaining functions using andThen

        System.out.println(function3.andThen(function4).apply(3)); // 3*3*2 =18, then 18+2 = 20
        System.out.println(function4.andThen(function3).apply(3)); // 3+2 = 5, then 5*5*2 = 50

//--------------------------------------------------------------------------------------------------------------------


// chaining functions  usingcompose

        // The compose method applies the second function first, and then the first function to the result
        // In this case, it will add 2 to the input and then square the result and multiply by 2
        System.out.println(function3.compose(function4).apply(7)); // 7+2 = 9, then 9*9*2 = 162

//--------------------------------------------------------------------------------------------------------------------

// identity function

        // The identity function returns the input as it is without any modification
        // It can be useful when you want to pass a function that does nothing
        Function<String,String> identityFunction = Function.identity();
        System.out.println(identityFunction.apply("Hello, World!")); // Output: Hello, World!

    }


}
