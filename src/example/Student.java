package example;

import java.util.Comparator;

public class Student {
    private final String name;
    private final int mark;

    public Student(String name,int mark){
        this.name=name;
        this.mark=mark;
    }

    public String getName() {
        return name;
    }

    public int getMark() {
        return mark;
    }

    public static final Comparator<Student> sortMarkComparator = (m1, m2) -> {
        int mark1 = m1.getMark();
        int mark2 = m2.getMark();
        return mark1-mark2;
    };
}
