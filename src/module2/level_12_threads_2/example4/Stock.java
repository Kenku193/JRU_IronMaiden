package module2.level_12_threads_2.example4;

public class Stock {
    public Integer fee = 0; // КОМИССИЯ БИРЖИ
    public final Object monitor; // ОБЪЕКТ-МОНИТОР (МЬЮТЕКС)
    // ЕГО ЗАДАЧА - РЕГУЛИРОВАТЬ ДОСТУП В КРИТИЧЕСКУЮ СЕКЦИЮ
    // МНОГОПОТОЧНОГО КОДА

    public Stock(Object monitor) {
        this.monitor = monitor;
    }
}
