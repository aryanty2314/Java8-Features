package predicates;

import java.util.function.Predicate;


public class Main1
{
    public static void main(String[] args){

//  A predicate function is a function that takes an input and returns a boolean value (true or false).
//  In Java, the Predicate<T> interface represents a predicate function that takes an argument of type T and returns a boolean.
//  It is commonly used for filtering or matching elements based on a condition.

        // Predicate function: checks if an integer is greater than 100
        Predicate<Integer> predicate = (x) -> x > 100;
        // Test the predicate with 110 (should print true)
        System.out.println(predicate.test(110));

        // Predicate function: checks if a string's length is greater than 5
        Predicate<String> predicate1 = (s) -> s.length() > 5;

        // Predicate function: checks if a string contains the character 'a'
        Predicate<String> predicate2 = (s) -> s.contains("a");

        // Combines predicate1 and predicate2 with logical AND
        Predicate<String> predicate3 = predicate1.and(predicate2);

        // Combines predicate1 and predicate2 with logical OR
        Predicate<String> predicate4 = predicate1.or(predicate2);

        // Negates predicate1 (true if string length is NOT greater than 5)
        Predicate<String> predicate5 = predicate1.negate();

        // Test predicate4 (OR) with "cdef" (should print false)
        System.out.println(predicate4.test("cdef"));

        // Test predicate5 (negate) with "cdefg" (should print true)
        System.out.println(predicate5.test("cdefg"));

        // Test predicate3 (AND) with "abcdefg" (should print true)
        System.out.println(predicate3.test("abcdefg"));

    }
}
