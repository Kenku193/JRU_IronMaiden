package module1.level22_elective_2.coffee.order;

//        2. Создать класс Order. Этот класс представляет собой цифровое отображение заказа.
//        Этот класс содержит номер заказа и имя человека, который его заказал.
public class Order {
    int orderNumber;
    String clientName;

    public Order(int orderNumber, String clientName) {
        this.orderNumber = orderNumber;
        this.clientName = clientName;
    }

//    public boolean isReady(){
//        return true;
//    }

    @Override
    public String toString() {
        return "Order{" +
                "orderNumber=" + orderNumber +
                ", clientName='" + clientName + '\'' +
                '}';
    }
}
