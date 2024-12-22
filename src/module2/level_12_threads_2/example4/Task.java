package module2.level_12_threads_2.example4;

class Task extends Thread{

    Stock stock;

    public Task(Stock stock){
        this.stock = stock;
    }

    @Override
    public void run() {

        System.out.println("БРОКЕР КУПИЛ");
        System.out.println("БРОКЕР ЕЩЕ КУПИЛ");

        // КРИТИЧЕСКАЯ СЕКЦИЯ (ТУАЛЕТ С ДВЕРЬЮ И ЗАМКОМ)
        // РЕГУЛИРУЕТ ДОСТУП ОБЪЕКТ-МОНИТОР
        // КТО В КАКОЙ ОЧЕРЕДНОСТИ БУДЕТ В ЭТОЙ СЕКИИ РАБОТАТЬ
        synchronized (stock.monitor) {
            stock.fee += getOneFee();
        }
        //КАКОЙ-ТО КОД ЛЮБОЙ
        System.out.println("БРОКЕР ПРОДАЛ");
        System.out.println("БРОКЕР КУПИЛ");
    }

    private int getOneFee(){
        return 1;
    }
}
