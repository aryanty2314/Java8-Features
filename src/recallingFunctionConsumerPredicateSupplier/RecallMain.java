package recallingFunctionConsumerPredicateSupplier;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class RecallMain
{
    // Recall the use of Function, Consumer, Predicate, and Supplier interfaces

    public static void main(String[] args)
    {

        // Predicate: Takes an input and returns a boolean value
        Predicate<Integer> predicate = x -> x % 2 != 0;

        // Function: Takes an input and produces an output
        Function<Integer,Integer> function = x -> x * x;

        // Consumer: Takes an input and performs an action (does not return a value)
        Consumer<Integer> consumer = (x) -> System.out.println(x);

        // Supplier: Provides a value without taking any input
        Supplier<Integer> supplier = ()->5 ;

        if (predicate.test(supplier.get()))
        {
            consumer.accept(function.apply(10));
        }
    }
}
