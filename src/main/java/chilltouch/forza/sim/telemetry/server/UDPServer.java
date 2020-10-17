package chilltouch.forza.sim.telemetry.server;

import chilltouch.forza.sim.telemetry.utils.Adaptor;

import java.io.IOException;
import java.net.*;

public class UDPServer extends Thread {
    private int port;
    private int bufferSize;
    private volatile boolean running = false;
    private DatagramSocket udp;

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
        try {
            udp = new DatagramSocket(address);
            byte[] buffer = new byte[500];
            DatagramPacket packet = new DatagramPacket(buffer, buffer.length);
            while(running) {
                try {
                    udp.receive(packet);
                    System.out.println(Adaptor.getEntity(packet.getData()));
                } catch (Exception ie) {
                    System.out.println(ie.getMessage());
                }
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
        udp.disconnect();
        this.running = false;
    }
}
