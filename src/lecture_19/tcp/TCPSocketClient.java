package lecture_19.tcp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class TCPSocketClient {
    public static void main(String[] args) {
        try{
            Socket socket = new Socket("localhost", 12345);
            System.out.println("Идет подключение к серверу");

            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));

            String message = "Привет, сервер! Это сообщение которое отправлено от клиента";
            out.println(message);
            System.out.println("Сообщение отправлено серверу: " + message);

            String serverMessage = in.readLine();
            System.out.println("Получен ответ от сервера: " + serverMessage);

            socket.close();

        } catch (UnknownHostException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
