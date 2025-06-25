package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamsCreationTypes {
    public static void main(String[] args) {

        System.out.println("--------------------------------------------------");

        // First way to create a stream
        // Convert a collection to a stream
        // Example with a List
        // Note: This is a simple example, in practice you might use a more complex collection
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        Stream<Integer> streaming = list.stream();
        streaming.forEach(System.out::println);

        System.out.println("--------------------------------------------------");

        // Second way to create a stream
        // Convert an array to a stream
        // Example with an array of Strings
        String[] str = {"Aryan", "Atharv", "Aarav"};
        System.out.println(Arrays.stream(str).allMatch(x -> x.startsWith("B"))); // Check if all names start with 'A'

        System.out.println("--------------------------------------------------");

        // Third way to create a stream
        Stream<Integer> integerStream = Stream.of(1, 2, 3);
        integerStream.iterator().forEachRemaining(System.out::println); // Print each integer in the stream

        System.out.println("--------------------------------------------------");

        // Fourth way to create a stream
        // Create an infinite stream using Stream.iterate
        Stream.iterate(0, n -> n + 1)
                .limit(100)
                .forEach(System.out::println); // Print first 100 integers starting from 0

        System.out.println("--------------------------------------------------");

        // Fifth way to create a stream
        // Create an infinite stream using Stream.generate
        Stream.generate(Math::random).limit(5).forEach(System.out::println);

        System.out.println("--------------------------------------------------");

        // Convert a stream to a list
        List<Integer> integerList = Stream.of(4, 5, 6).toList();
        System.out.println(integerList); // Print the list created from the stream

        System.out.println("--------------------------------------------------");

        // Convert a stream to an array
        Integer[] integerArray = Stream.of(7, 8, 9).toArray(Integer[]::new);
        System.out.println(Arrays.toString(integerArray)); // Print the array created from the stream


    }
}
