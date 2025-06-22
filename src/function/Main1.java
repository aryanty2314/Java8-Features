package function;

import java.util.function.Function;

public class Main1
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
    }
}
