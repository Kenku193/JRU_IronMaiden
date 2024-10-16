package module1.level22_elective_2.coffee.order;
//
//
//        1. Создать класс CoffeeOrderBoard. Этот класс представляет собой цифровое отображение очереди заказов в кофейне.
//        Этот класс содержит список заказов.

import java.util.*;

//        3. Реализовать метод add в классе CoffeeOrderBoard.
//        Этот метод добавляет новый заказ и присваивает ему номер (натуральный порядок).
//        *Натуральный порядок (natural ordering) означает, что если у последнего заказа номер 86, то следующий будет 87.
//        Не может быть ситуации, когда номер повторяется в пределах одного объекта типа CoffeeOrderBoard.
//
//        4. Реализовать метод deliver в классе CoffeeOrderBoard.
//        Этот метод выдает ближайший в очереди заказ. Выдача сопровождается удалением заказа из списка.
//
//        5. Реализовать метод deliver в классе CoffeeOrderBoard.
//        Этот метод выдает заказ с определенным номером. Выдача сопровождается удалением заказа из списка.
//        Этот метод обрабатывает ситуацию, когда заказ, поступивший позже, готов раньше.
//
//        6. Реализовать метод draw в классе CoffeeOrderBoard.
//        Этот метод выводит в консоль информацию о текущем состоянии очереди в порядке ближайшего к выдаче заказа.
//        Например:
//
//        =============
//        Num | Name
//        4   | Alen
//        27  | Yoda
//        33  | Obi-van
//        34  | John Snow
public class CoffeeOrderBoard {
//    Этот класс содержит список заказов. - ???

    // KEY - OderNumber
    // Value - Order
    HashMap<Integer, Order> orderHashMap = new HashMap<>();

    int counter = 0;

    public void add(String clientName){
        orderHashMap.put(++counter, new Order(counter, clientName));
    }

    public Order deliver(){
        Set<Integer> keySet = orderHashMap.keySet();
        Integer min = Collections.min(keySet);
        Order order = orderHashMap.get(min);
        orderHashMap.remove(min);
        return order;
    }

    public Order deliver(int orderNumber){
        Order order = orderHashMap.get(orderNumber);
        orderHashMap.remove(orderNumber);
        return order;
    }

    public void draw(){
        System.out.println(orderHashMap.values());

    }
}

class App{
    public static void main(String[] args) {
        CoffeeOrderBoard coffeeOrderBoard = new CoffeeOrderBoard();
        coffeeOrderBoard.add("Syrovatko");
        coffeeOrderBoard.add("So");
        coffeeOrderBoard.add("Sodas");
        coffeeOrderBoard.draw();
    }
}
