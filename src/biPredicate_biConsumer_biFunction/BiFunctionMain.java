package biPredicate_biConsumer_biFunction;

import java.util.function.BiFunction;

public class BiFunctionMain
{
    public static void main(String[] args) {


        //A BiFunction in Java is a functional interface that takes two arguments and returns a result.
        BiFunction<Integer,Integer,Integer> biFunction = (x,y)->
        {
            if (x % 2 != 0 && y % 2 == 0)
            {
                return x + y;
            }
            return x-y;
        };

        System.out.println(biFunction.apply(15,20));



        //Another example of BiFunction
        //This BiFunction takes a String and an Integer, and returns the product of the length of the String and the Integer plus 2.

        BiFunction<String,Integer,Integer> biFunction1 = (x,y)->x.length()*(2+y);
        System.out.println(biFunction1.apply("abcd",2));
    }
}
