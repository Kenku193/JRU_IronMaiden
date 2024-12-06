package module2.level_08_constructorsAndStatic.example4;

public class Point1D {

    //  private static int id = 222;

    // КООРДИНАТА
    private int x;

    // ЛОГИЧЕСКИЙ БЛОК СРАБАТЫВАЕТ ПРЕЖДЕ ВСЕГО
    {
        x = 4;
        System.out.println("В логическом блоке х= " + this.x);
    }

    // КОНСТРУКТОР
    public Point1D(int x) {
        System.out.println("Constructor 1D started");
        this.x = x; // this.x = -2;
        System.out.println("x= " + this.getX());
        //  System.out.println("x= " + x);
        System.out.println(this);
        System.out.println("Constructor 1D finished");
    }

    // ГЕТТЕР
    public int getX() {
        System.out.println("сработал геттер getX Point1D");
        return x;
    }

    // СЕТТЕР
    public void setX(int x) {
        this.x = x;
    }

    // МЕТОД КОТОРЫЙ ВИДЕН В ПОТОМКАХ - РАССТОЯНИЕ ОТ НАЧАЛА КООРДИНАТ (АБСОЛЮТНОЕ ЗНАЧЕНИЕ)
    protected double getDistance(){
        return Math.abs(x);
    }

    // toString
    @Override
    public String toString() {
        return "Point1D{" +
                "x=" + x + " distance= " + getDistance() +
                '}';
    }
}
