package module1.level19_singletoneSwitchEnum.singleton;

public class App {
    public static void main(String[] args) {

        Singleton instance = Singleton.getInstance();
        System.out.println(instance);
        instance.multiply(4, 10);

        Grandpa grandpa = new Grandpa();
        grandpa.multiply(5, 5);

    }
}
