package module1.level17_collections_2;

public class Student {
    int design;
    int math;
    int english;

    public Student(int design, int math, int english) {
        this.design = design;
        this.math = math;
        this.english = english;
    }

    @Override
    public String toString() {
        return "Student{" +
                "design=" + design +
                ", math=" + math +
                ", english=" + english +
                '}';
    }
}
