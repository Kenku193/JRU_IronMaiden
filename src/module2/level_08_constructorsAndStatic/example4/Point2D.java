package module2.level_08_constructorsAndStatic.example4;
// НАСЛЕДУЕТСЯ ОТ Point1D
public class Point2D extends Point1D {
    // КООРДИНАТА
    private int x;
    private int y;

    // КОНСТРУКТОР
    public Point2D(int x, int y) {
        // МЫ ДОЛЖНЫ ОБРАЩАТЬСЯ К КОНСТРУКТОРУ РОДИТЕЛЯ
        super(x);
        System.out.println("Constructor 2D started");
        this.x = x;
        this.y = y;
        System.out.println("x= " + this.getX());
        System.out.println("y= " + this.getY());
        System.out.println(this);
        System.out.println("Constructor 2D finished");
    }

    // ГЕТТЕР
    public int getX() {
        System.out.println("сработал геттер getX Point2D");
        return x;
    }

    public int getY() {
        System.out.println("сработал геттер getY Point2D");
        return y;
    }


    // МЕТОД КОТОРЫЙ ВИДЕН В ПОТОМКАХ - РАССТОЯНИЕ ОТ НАЧАЛА КООРДИНАТ
    // НО ТАК КАК КООРДИНАТ СТАЛО ДВЕ - РАССТОЯНИЕ ЕСТЬ НИ ЧТО ИНОЕ КАК ГИПОТЕНУЗА
    protected double getDistance(){
        return Math.hypot(x, y);
    }

    // toString
    @Override
    public String toString() {
        return "Point2D{" +
                "x=" + x +
                ", y=" + y +
                " distance= " + getDistance() +
                '}';
    }
}
