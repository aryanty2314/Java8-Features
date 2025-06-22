package lambdaExpression.comparator;

import java.util.*;

public class Mapmain
{
    public static void main(String[] args)
    {
        Employee emp = new Employee("Aryan",21);
        Employee emp1 = new Employee("Aman",25);
        Employee emp2 = new Employee("Ishu",20);

          // we cannot pass the comparator inside the Hashmap constructor
         // because hashmap does not maintain the order of the elements
        //   Map<Integer,String> descMap = new HashMap<>((a,b)->{});

      // instead we can use TreeMap

        Map<Integer,String> descMap = new TreeMap<>((a,b)->b.compareTo(a));

        descMap.put(21,"Harry patter");
        descMap.put(51,"Superman");
        descMap.put(42,"Batman");

        List<Employee> list = new ArrayList<>();
        list.add(emp);
        list.add(emp1);
        list.add(emp2);

        Collections.sort(list,(a,b)->b.getAge()-a.getAge());
        System.out.println("Sorted by age in descending order:"+  list);
        System.out.println(descMap);

    }
    static class Employee {
        private String name;
        private int age;

        public Employee(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        @Override
        public String toString() {
            return "Employee{name='" + name + "', age=" + age + '}';
        }
        public Employee()
        {}
}

}
