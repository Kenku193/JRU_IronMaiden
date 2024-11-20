package module2.level_04_interfaces.contracts;

public interface Stopable extends Movable {
   default void stop(){
       System.out.println("Стандартная остановка ТС");
   };

}
