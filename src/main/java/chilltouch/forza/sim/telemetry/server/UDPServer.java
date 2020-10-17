package chilltouch.forza.sim.telemetry.server;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class UDPServer extends Thread {
    private DatagramSocket udpServer;
    private int port;
    private int bufferSize;
    private volatile boolean running = false;

    public UDPServer(int port, int bufferSize) throws SocketException {
        this.bufferSize = bufferSize;
        this.port = port;
        initServer();
    }

    private void initServer() throws SocketException {
        this.running = true;
        this.udpServer = new DatagramSocket(port);
    }

    @Override
    public void run() {
        while (running) {
            try {
                byte[] buffer = new byte[1024];
                DatagramPacket receivePacket = new DatagramPacket(buffer, buffer.length);
                udpServer.receive(receivePacket);
                String sentence = new String( receivePacket.getData());
                System.out.println(sentence);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        destroyServer();
    }

    public void stopServer() {
        this.running = false;
    }

    public void destroyServer() {
        this.udpServer.close();
    }
}
