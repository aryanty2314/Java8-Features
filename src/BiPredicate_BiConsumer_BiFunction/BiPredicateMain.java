package BiPredicate_BiConsumer_BiFunction;

import java.util.function.BiPredicate;

public class BiPredicateMain
{
    public static void main(String[] args) {

        // BiPredicate is a method which is used when we have to pass two arguments in a predicate
        // and it returns a boolean value.
        // It is a functional interface and can be used as the assignment target for a lambda expression or method reference.

        BiPredicate<Integer,Integer> bi =(x,y)-> (x % 2 != 0 && y % 2 == 0);
        System.out.println(bi.test(10,20));


        // Example 2: Check if the length of a string is equal to a given number
        // Here, we are using BiPredicate to check if the length of a string is equal to a given number.
        BiPredicate<String,Integer> bi1 =(str,s)->( str.length()/2 == s );
        System.out.println(bi1.test("abcd",2));
    }
}
