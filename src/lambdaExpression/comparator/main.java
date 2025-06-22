package lambdaExpression.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class main
{
    public static void main(String[] args) {
//        Comparator <Integer> comparator = (s1,s2) -> {
//            return s2-s1; // Sort in descending order
//        };
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        Collections.sort(list, (a,b) -> b - a); // Sort in descending order using lambda expression
        System.out.println(list);
    }
}
