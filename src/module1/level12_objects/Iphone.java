package module1.level12_objects;

public class Iphone {
    private String model;
    private String color;
    private int price;

    public Iphone(String model, String color, int price) {
        this.model = model;
        this.color = color;
        this.price = price;
    }

    public boolean equals(Object iph) {
        if (this == iph)
            return true;// за проверку не передали тот же объект (iphone1.equals(iphone1))
        if (iph == null)
            return false;// за проверку не передали null в метод equals (iphone1.equals(null))

        if (!(iph instanceof Iphone))
            return false;// проверка объекты одного класса
        Iphone iphone = (Iphone) iph;
        if (this.model == null || iphone.model == null)
            return this.model == iphone.model && this.color.equals(iphone.color) && this.price == iphone.price;
        if (this.color == null || iphone.color == null)
            return this.model.equals(iphone.model) && this.color == iphone.color && this.price == iphone.price;

        return this.model.equals(iphone.model) && this.color.equals(iphone.color) && this.price == iphone.price;
    }
    //напишите тут ваш код

    public static void main(String[] args) {
        Iphone iphone1 = new Iphone("X", "Black", 999);
        Iphone iphone2 = new Iphone("X", "Black", 999);

        System.out.println(iphone1.equals(iphone2));
    }

}
