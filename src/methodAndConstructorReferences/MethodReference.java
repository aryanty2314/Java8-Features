package methodAndConstructorReferences;

import function.Student;

import java.util.Arrays;
import java.util.List;

public class MethodReference
{
    // This method will be used as a method reference
    public static void printMessage(String message) {
        System.out.println(message);
    }
    // Method references are a shorthand notation of a lambda expression to call a method.
    // They allow you to refer to a method without executing it.
    // Method references can be used to refer to a static method, an instance method, or a constructor.

    public static void main(String[] args)
    {

        MethodReference methodReference = new MethodReference();

        List<String> students = Arrays.asList("John", "Alice", "Bob");
        // Using a method reference to print each student's name
        students.forEach(MethodReference::printMessage);
        // Using a method reference to print student details

        Student student1 = new Student("John", 20);
        Student student2 = new Student("Alice", 22);
        Student student3 = new Student("Bob", 21);

        List<Student> studentList = Arrays.asList(student1, student2, student3);

        // Using a method reference to print student details when method is not static
        studentList.forEach(methodReference::printStudentDetails);
    }

    // Instance method to print student details
    // if you don't want to make a static method, you can create an instance in the main method
    // Then use the instance method reference.
    public void printStudentDetails(Student student) {

        // Using a method reference to print student details
        System.out.println(student.getName() + " is " + student.getAge() + " years old.");
    }

}
