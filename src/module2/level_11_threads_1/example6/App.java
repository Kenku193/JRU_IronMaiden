package module2.level_11_threads_1.example6;

import java.io.File;

public class App {
    public static void main(String[] args) {

        // МНЕ НА ЗАШИФРОВКУ ОДНОВРЕМЕННО ПРИШЛО 10 ФАЙЛОВ
        Encrypt e = new Encrypt();

        new Thread(e).start();
        new Thread(e).start();
        new Thread(e).start();
        new Thread(e).start();
        new Thread(e).start();
        new Thread(e).start();
        new Thread(e).start();
        new Thread(e).start();
        new Thread(e).start();
        new Thread(e).start();
        new Thread(e).start();

        // МНЕ НА РАСШИФРОВКУ ОДНОВРЕМЕННО ПРИШЛО ДРУГИЕ 5 ФАЙЛОВ

        Decrypt d = new Decrypt();
        new Thread(d).start();
        new Thread(d).start();
        new Thread(d).start();
        new Thread(d).start();
        new Thread(d).start();

        // СТАТ АНАЛИЗ НЕ МНОГОПОТОЧНЫЙ
        StatAnalysis s = new StatAnalysis();
        s.analyse(new File("ds"));
    }
}
