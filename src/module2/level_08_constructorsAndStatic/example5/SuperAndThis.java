package module2.level_08_constructorsAndStatic.example5;

public class SuperAndThis extends Object {

    public static void main(String[] args) {
        Point3D point3D = new Point3D(1,2,3);
    }
}

class Point1D {
    private int x;
    protected String someText = "text";

    public Point1D(int x) {
        this.x = x;
    }

    protected void someMethod(int o){
        System.out.println("do nothing" + o);
    }
}

// КЛЮЧЕВОЕ СЛОВО super ПРИМЕНЯЕТСЯ ДЛЯ ОБРАЩЕНИЯ К КОНСТРУКТОРУ, ПОЛЮ ИЛИ МЕТОДУ СУПЕРКЛАССА - КЛАССА-РОДИТЕЛЯ

class Point2D extends Point1D {
    private int y;

    public Point2D(int x, int y) {
        super(x); // super СО СКОБОЧКАМИ - ОБРАЩАЕМСЯ К КОНСТРУКТОРУ СУПЕРКЛАССА (Point1D)
        String someText1 = super.someText; // super С ТОЧКОЙ - ОБРАЩАЕМСЯ К ПОЛЮ
        this.someMethod(12); // ??
        someMethod(22); // ??
        super.someMethod(32); // ??
        this.y = y;
    }
}

// ВО ВСЕХ СЛУЧАЯХ ПРИ ИСПОЛЬЗВАНИИ super МОЖНО ОБРАТИТЬСЯ ТОЛЬКО К БЛИЖАЙШЕМУ СУПЕРКЛАССУ
// ПЕРЕСКОЧИТЬ ЧЕРЕЗ КЛАСС НЕ ПОЛУЧИТСЯ - К "ДЕДУШКЕ" "ВНУК ДОСТУЧАТЬСЯ НЕ МОЖЕТ

class Point3D extends Point2D {
    private int z;

    public Point3D(int x, int y, int z) {
        super(x, y); // super СО СКОБОЧКАМИ - ОБРАЩАЕМСЯ К КОНСТРУКТОРУ СУПЕРКЛАССА (Point2D)
        this.z = z;
    }
}
