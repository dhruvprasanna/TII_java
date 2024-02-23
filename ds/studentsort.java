package ds;

import java.util.ArrayList;
import java.util.Comparator;

public class studentsort {
    public static void main(String[] args) {
        Student s1 = new Student(10,"ravi");
        Student s2 = new Student(20,"ram");
        Student s3 = new Student(25,"abhi");
        Student s4 = new Student(45,"aryan");
        ArrayList<Student> arr = new ArrayList<>();
        arr.add(s2);
        arr.add(s4);
        arr.add(s1);
        arr.add(s3);
        System.out.print("Original List : ");
        for(Student s : arr){
            System.out.print(s.name + " " + s.age+" ");
        }
        arr.sort(Comparator.comparing(a -> a.age));
        System.out.print("\nSorted List : ");
        for(Student s : arr){
            System.out.print(s.name + " " + s.age+" ");
        }

    }
}
