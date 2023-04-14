package example;

import java.util.ArrayList;
import java.util.Scanner;

public class SortMark {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of Students: ");
        int n = scanner.nextInt();
        ArrayList<Student> students = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            System.out.println("Enter name of student " + (i + 1));
            String o = scanner.next();
            System.out.println("Enter the mark " + (i + 1));
            int p = scanner.nextInt();
            Student student = new Student(o, p);
            students.add(student);
        }
        students.sort(Student.sortMarkComparator);
        Student highest = students.get(n-1);
        System.out.println("Highest : "+highest.getName()+" "+highest.getMark());
        students.forEach(student->System.out.println(student.getName()+" "+student.getMark()));
    }
}
