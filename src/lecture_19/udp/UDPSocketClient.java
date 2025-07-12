package lecture_19.udp;

import java.io.IOException;
import java.net.*;

public class UDPSocketClient {
    public static void main(String[] args) {
        try {
            DatagramSocket socket = new DatagramSocket();
            System.out.println("Подключение к серверу");

            String message = "Привет, сервер. Это клиент";

            byte[] buffer = message.getBytes();

            DatagramPacket packet = new DatagramPacket(
                    buffer,
                    buffer.length,
                    InetAddress.getByName("localhost"),
                    12345
            );

            socket.send(packet);
            System.out.println("Серверу отправлено сообщение:" + message);

            byte[] responseBuffer = new byte[256];
            DatagramPacket responsePacket = new DatagramPacket(responseBuffer, responseBuffer.length);
            socket.receive(responsePacket);

            String responseMessage = new String(responsePacket.getData(), 0, responsePacket.getLength());
            System.out.println("Ответ от сервера: " + responseMessage);

            socket.close();


        } catch (SocketException e) {
            throw new RuntimeException(e);
        } catch (UnknownHostException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
