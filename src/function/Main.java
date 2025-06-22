package function;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class Main
{
    public static void main(String[] args) {

        // Example of a Function that takes a String and returns its length
        // This Function takes a String as input and returns an Integer (the length of the String)
        Function<String, Integer> function1 = s -> s.length();
        // Using the function to get the length of a string
        System.out.println(function1.apply("Hello, World!"));

        Function<String, String> function2 = (s)->s.substring(0,3);

        Function<List<Student>,List<Student>> list = li->{
            List<Student> students = new ArrayList<>();
            for (Student s:li)
            {
                if (function2.apply(s.getName()).equalsIgnoreCase("ary"))
                {
                    students.add(s);
                }
            }
            return students;
        };

        Student s1 = new Student("Aryan", 20);
        Student s2 = new Student("Arya", 22);
        Student s3 = new Student("John", 21);
        Student s4 = new Student("Aryansh",28);

         List<Student> students = Arrays.asList(s1,s2,s3,s4);
         List<Student> filteredStudents = list.apply(students);
        System.out.println("Filtered Students: "+ filteredStudents);


    }
}
