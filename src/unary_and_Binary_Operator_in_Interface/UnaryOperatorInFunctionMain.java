package unary_and_Binary_Operator_in_Interface;

import java.util.function.Function;
import java.util.function.UnaryOperator;

public class UnaryOperatorInFunctionMain
{
    public static void main(String[] args)
    {

        Function<Integer,Integer> sum = x -> x + x * x;
        System.out.println(sum.apply(5));

        // Using UnaryOperator
        // UnaryOperator is a specialization of Function that takes a single argument and returns a result of the same type.
        // It is a functional interface that extends Function<T, T>.
        // It is used when the input and output types are the same.

        UnaryOperator<Integer> addition = x -> x + x * x;
        System.out.println(addition.apply(5));
    }
}
