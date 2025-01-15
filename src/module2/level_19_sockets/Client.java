package module2.level_19_sockets;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) throws IOException {

        // localhost + 25000
        InetAddress localHost = InetAddress.getLocalHost();
        Socket socket = new Socket(localHost, 25000);

        System.out.println("Клиент начал работу!");

        // ТО ЧТО БУДЕТ ОТПРАВЛЯТЬ ЗАПРОСЫ К СЕРВЕРУ
        BufferedWriter output = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
        // ТО ЧТО БУДЕТ ПОЛУЧПТЬ ОТВЕТЫ ОТ СЕРВЕРА
        BufferedReader input = new BufferedReader(new InputStreamReader(socket.getInputStream()));

        // ОТПРАВЛЯЕМ ЗАПРОС НА СЕРВЕР
        Scanner console = new Scanner(System.in);
        String request = "Тот самый текст для разворота\n";
        output.write(request);
        output.flush();

        // ПОЛУЧАЕМ ОТВЕТ ОТ СЕРВЕРА
        String response = input.readLine();
        System.out.println("ОТВЕТ: " + response);

        socket.close();
        input.close();
        output.close();
    }
}
