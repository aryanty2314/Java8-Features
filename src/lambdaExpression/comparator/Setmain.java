package lambdaExpression.comparator;

import java.util.Set;
import java.util.TreeSet;

public class Setmain
{
    public static void main(String[] args)
    {

        // Using a lambda expression to sort a TreeSet in descending order of integers.
        // The TreeSet will automatically sort the elements based on the provided comparator.
        Set<Integer> set = new TreeSet<>((a,b)->b-a);
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(40);
        set.add(50);
        System.out.println(set);
    }
}
