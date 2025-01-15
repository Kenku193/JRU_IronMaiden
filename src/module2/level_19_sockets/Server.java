package module2.level_19_sockets;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

    static int requestCounter = 0;
    public static void main(String[] args) throws IOException {

        // localhost:25000
        // 127.0.0.1:25000

        ServerSocket serverSocket = new ServerSocket(25000);

        System.out.println(serverSocket.getLocalPort());

        System.out.println("Сервер запущен!");

        while (true){

            // МЕХАНИЗМ ОБМЕНА
            Socket socket = serverSocket.accept();
            // МЕХАНИЗМ ПРИЕМА
            BufferedReader input = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            // МЕХАНИЗМ ОТВЕТА
            BufferedWriter output = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));

            // ЗАПРОС (И ТОЧКА ЕГО ПОЛУЧЕНИЯ)
            String request = input.readLine();
            System.out.println("Запрос получен! " + ++requestCounter);
            System.out.println("Тело зпроса: " + request);

            // ОТВЕТ
            String response = new StringBuilder(request).reverse().toString();
            // ТОЧКА ОТПРАВКИ ОТВЕТА
            output.write(response);
            output.flush();

            socket.close();
            input.close();
            output.close();

        }
    }
}
