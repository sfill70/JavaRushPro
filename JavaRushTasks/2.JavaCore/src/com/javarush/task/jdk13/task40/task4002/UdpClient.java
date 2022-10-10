package com.javarush.task.jdk13.task40.task4002;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/*Реализуй метод sendReceive(String message) в UdpClient.
Он должен: - с помощью DatagramSocket отправить сообщение message на сервер
с адресом serverAddress и портом serverPort; - получить сообщение с того же сервера
(можно использовать буфер размером 1024 байт); - вернуть полученное сообщение в виде строки.*/
public class UdpClient {

    private final DatagramSocket socket;
    private final InetAddress serverAddress;
    private final int serverPort;

    public UdpClient(int port) throws IOException {
        socket = new DatagramSocket(port);
        serverAddress = InetAddress.getByName("localhost");
        serverPort = 4445;
    }

    public String sendReceive(String message) throws IOException {
        byte[] buf = message.getBytes();
        DatagramPacket packet = new DatagramPacket(buf, buf.length, serverAddress, serverPort);
        socket.send(packet);

        packet = new DatagramPacket(new byte[1024], 1024);
        socket.receive(packet);
        return new String(packet.getData(), 0, packet.getLength());
    }



    public void close() {
        socket.close();
    }
}
