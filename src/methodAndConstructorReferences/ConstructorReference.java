package methodAndConstructorReferences;

import function.Student;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ConstructorReference
{
    public static void printStudentDetails(Student student)
    {
        // Using a methodreference to print student details
        System.out.println(student);
    }

    public static void main(String[] args)
    {

        // Constructor references are a shorthand notation of a lambda expression to create an object.
        List<Student> studentList = Arrays.asList(new Student("Aryan",21),new Student("Aman",25));

        // Using a constructor reference to create a new Student object
        // Constructor references can be used to refer to a constructor of a class.
        // They allow you to create an object without executing the constructor.
        // This is the traditional way of creating a new object using a constructor.
        List<Student> students = studentList.stream().map(x-> new Student(x.getName(),x.getAge())).collect(Collectors.toList());
        students.forEach(ConstructorReference::printStudentDetails);


        // Using a constructor reference to create a new Student object
        // this is the shorthand way of creating a new object using a constructor reference.
        List<Student> student = studentList.stream().map(Student::new).collect(Collectors.toList());
        student.forEach(ConstructorReference::printStudentDetails);

    }

}
