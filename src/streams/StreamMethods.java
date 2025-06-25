package streams;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamMethods
{
    public static void main(String[] args)
    {
    List<String> list = List.of("apple", "banana", "cherry", "date", "elderberry", "fig", "grape" , "apple", "date");
    // Example of using Stream methods

    list.stream()

            //filter the elements and this method takes a predicate
            .filter(s->s.contains("a"))

            //map the elements and this method takes a function
            .map(s->s.toUpperCase())

            //distinct the elements and this method returns a stream with distinct elements
            .distinct()

            //sort the elements and this method returns a sorted stream and takes a comparator
            .sorted(Comparator.reverseOrder())

            //limit the elements and this method takes a long value
            .limit(4)

            //skip the elements and this method takes a long value
            .skip(1)

            //collect the elements and this method returns a list
            .collect(Collectors.toList())

            //print the elements
            .forEach(System.out::println);


     Stream.iterate(0, n -> n + 1)
            .limit(10)
            .filter(x->x % 2 == 0)
            .map(x->x * 2)
            .distinct()

             // Use peek to perform an action on each element
             // we can use peek to debug or log the elements
             .peek(x-> System.out.println("Processing: " + x))
             .min((a, b) -> b-a)
             .ifPresent(System.out::println);
    }
}
