package consumer;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;

public class consumerMain
{
    public static void main(String[] args)
    {
        // A Consumer is a functional interface that represents an operation that takes a single input argument and returns no result.
        // It is often used for operations that have side effects, such as printing to the console or modifying an object.
        // Example of a Consumer that takes an Integer and prints its square
        // This Consumer takes an Integer as input and performs an action (printing its square)

        Consumer<Integer> consumer = (x) -> {
            // This consumer takes an Integer and prints its square
            System.out.println("Square of " + x + " is: " + (x * x));
        };
        Consumer<Integer> consumer1 = (x) -> {
            System.out.println("Cube of " + x + " is: " + (x * x * x));
        };
        consumer.accept(11); // This will print: Square of 11 is: 121

        Consumer<List<Integer>> linkedconsumer = (list) -> {
            // This consumer takes a List of Integers and prints each element
            for (Integer i : list) {
                System.out.println("Element: " + i);
            }
        };

        linkedconsumer.accept(Arrays.asList(101,101,1010101,101010101,12));

        // this a default method inside our consumer interface which basically
        // print the first consumer and then second consumer.
        consumer.andThen(consumer1).accept(5);
    }

}
