package lecture_19.tcp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServerSocket {
    public static void main(String[] args) {
        try{
            ServerSocket serverSocket = new ServerSocket(12345);
            System.out.println("Сервер запущен, он ждет подключение от клиента");

            Socket clientSocket = serverSocket.accept();
            System.out.println("Клиент подключился " + clientSocket.getInetAddress());

            BufferedReader in = new BufferedReader(
                    new InputStreamReader(clientSocket.getInputStream()));

            PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);

            String message = in.readLine();
            System.out.println("От клиента получено сообщение: " + message);

            out.println("Привет, клиент. Это сервер. " +
                    "Вот сообщение, которое ты мне отправлял: " + message);

            clientSocket.close();
            serverSocket.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


}
