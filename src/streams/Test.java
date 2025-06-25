package streams;

import java.util.Arrays;

public class Test
{
    public static void main(String[] args) {

        // This is a simple program that creates an array of integers from 1 to 10
        // and calculates the sum of even numbers in that array.
        int[] arr = new int[10];
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
            if (arr[i] % 2 == 0)
            {
            sum += arr[i];
            }

        }
        System.out.println(sum);

        // It is a more functional approach to processing collections of data.
        // The stream API allows for a more declarative style of programming.
        // It is a powerful feature introduced in Java 8 that allows for functional-style operations on collections.
        // The following code demonstrates how to use streams to filter and sum even numbers in an array.
        int[] arr2 = new int[10];
        int sum2 = Arrays.stream(arr)
                .filter(i -> i % 2 == 0) // Filter even numbers
                .sum(); // Sum the filtered numbers
        System.out.println("Sum of even numbers using streams: " + sum2);

    }
}
