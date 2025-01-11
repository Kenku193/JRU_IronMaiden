package module2.level_18_annotations.example3SecondAnno;


import java.lang.annotation.Target;

public class Client {

    @TudaSuda(clientType = 10, isOk = true)
    int id;
   // @TudaSuda(clientType = 111)
    private String name;

}
