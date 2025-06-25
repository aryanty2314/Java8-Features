package unary_and_Binary_Operator_in_Interface;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;

public class BinaryOperatorInFunctionMain
{
    public static void main(String[] args) {
        // Using BinaryOperator
        // BinaryOperator is a specialization of Function that takes two arguments of the same type and returns a result of the same type.
        // It is a functional interface that extends BiFunction<T, T, T>.
        // It is used when the input and output types are the same.

        BinaryOperator<Integer> sum = (x, y) -> x + y;
        System.out.println(sum.apply(5, 10));

        // Using BiFunction
        // BiFunction is a functional interface that takes two arguments and returns a result.
        BiFunction<Integer, Integer, Integer> addition = (x, y) -> x + y;
        System.out.println(addition.apply(5, 10));
    }
}
