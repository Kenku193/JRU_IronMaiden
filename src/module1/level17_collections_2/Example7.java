package module1.level17_collections_2;

import java.util.Collections;
import java.util.Comparator;
import java.util.TreeMap;

public class Example7 {
    public static void main(String[] args) {

        Student student1 = new Student(5,3,2);
        Student student2 = new Student(5,4,2);
        Student student3 = new Student(5,5,5);
        Student student4 = new Student(2,2,2);
        Student student5 = new Student(2,2,3);


        TreeMap<Student, Integer> map = new TreeMap<>(
                new Comparator<Student>() {
                    @Override
                    public int compare(Student o1, Student o2) {
                        int gradeFirst = o1.design + o1.english + o1.math;
                        int gradeSecond = o2.design + o2.english + o2.math;
                        // int diff = gradeFirst - gradeSecond; // + / - / 0
                        return -Integer.compare(gradeFirst, gradeSecond);
                    }
                }
        );

        map.put(student1, 1);
        map.put(student3, 1);
        map.put(student2, 1);
        map.put(student5, 1);
        map.put(student4, 1);

        System.out.println(map);



    }
}
