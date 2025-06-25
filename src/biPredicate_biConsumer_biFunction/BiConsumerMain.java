package biPredicate_biConsumer_biFunction;

import java.util.function.BiConsumer;

public class BiConsumerMain
{
    public static void main(String[] args) {

        // Create a BiConsumer that takes two integers and prints their sum
        BiConsumer<Integer, Integer> sumConsumer = (a, b) -> {
            System.out.println("Sum: " + (a + b));
        };

        // Use the BiConsumer
        sumConsumer.accept(5, 10); // Output: Sum: 15

        // Create a BiConsumer that takes two strings and prints them concatenated
        java.util.function.BiConsumer<String, String> concatConsumer = (s1, s2) -> {
            System.out.println("Concatenated: " + s1 + s2);
        };

        // Use the BiConsumer
        concatConsumer.accept("Hello, ", "World!"); // Output: Concatenated: Hello, World!
    }
}
