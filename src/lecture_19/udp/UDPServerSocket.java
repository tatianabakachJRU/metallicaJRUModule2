package lecture_19.udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class UDPServerSocket {
    public static void main(String[] args) {
        try{
            DatagramSocket datagramSocket = new DatagramSocket(12345);
            System.out.println("Сервер запущен, ожидает сообщение от клиента");

            byte[] buffer = new byte[256];

            while (true){
                DatagramPacket packet = new DatagramPacket(buffer, buffer.length);
                datagramSocket.receive(packet);

                String message = new String(packet.getData(), 0, packet.getLength());
                System.out.println("От клинта получено сообщение: " + message);

                String serverMessage = "Привет, клиент! Это сервер. Вот твое сообщение: " + message;

                byte[] responseBuffer = serverMessage.getBytes();

                DatagramPacket responsePacket = new DatagramPacket(
                        responseBuffer,
                        responseBuffer.length,
                        packet.getAddress(),
                        packet.getPort()
                );
                datagramSocket.send(responsePacket);
                //datagramSocket.close();
            }

        } catch (SocketException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
