package chilltouch.forza.sim.telemetry.server;

import java.io.IOException;
import java.net.*;

public class UDPServer extends Thread {
    private int port;
    private int bufferSize;
    private volatile boolean running = false;

    public UDPServer(int port, int bufferSize) throws SocketException {
        this.bufferSize = bufferSize;
        this.port = port;
        this.running = true;
    }

    private void initServer() throws SocketException {
        this.running = true;
    }

    @Override
    public void run() {
        InetSocketAddress address = new InetSocketAddress("192.168.0.204", this.port);
        try (DatagramSocket udpServer = new DatagramSocket(address)) {
            byte[] buffer = new byte[500];
            DatagramPacket packet = new DatagramPacket(buffer, buffer.length);
            byte[] secondBuffer = new byte[500];
            for(;;) {
                if (!running) {
                    break;
                }
                try {
                    udpServer.receive(packet);
                    secondBuffer = packet.getData();
                } catch (Exception ie) {
                    System.out.println(ie.getMessage());
                }
                System.out.println("data received: " + data(secondBuffer));
            }
        } catch (SocketException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception ee) {
            ee.printStackTrace();
        }
    }

    public void stopServer() {
        this.running = false;
    }

    public static StringBuilder data(byte[] a)
    {
        if (a == null)
            return null;
        StringBuilder ret = new StringBuilder();
        int i = 0;
        while (a[i] != 0)
        {
            ret.append((char) a[i]);
            i++;
        }
        return ret;
    }
}
