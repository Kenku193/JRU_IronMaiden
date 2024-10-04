package module1.level19_singletoneSwitchEnum.singleton;
;

public class Singleton extends Grandpa {

    private static final Singleton INSTANCE = new Singleton();

    private String value = "Это синглтон";

    private Singleton() {
    }

    public String getValue() {
        return value;
    }

    public static Singleton getInstance() {
        return INSTANCE;
    }

}
