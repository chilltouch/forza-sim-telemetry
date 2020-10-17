package chilltouch.forza.sim.telemetry.server;

import chilltouch.forza.sim.telemetry.utils.Adaptor;
import chilltouch.forza.sim.telemetry.utils.PropertiesManager;
import chilltouch.forza.sim.telemetry.utils.PropertyKeys;

import java.io.IOException;
import java.net.*;

public class UDPServer extends Thread {
    private int port;
    private int bufferSize;
    private int soTimeout;
    private volatile boolean running = false;
    private DatagramSocket udp;
    private PropertiesManager propertiesManager;

    public UDPServer(int port, int bufferSize) throws SocketException {
        this.bufferSize = bufferSize;
        this.port = port;
        this.running = true;
    }

    public UDPServer(PropertiesManager propertiesManager) {
        this.propertiesManager = propertiesManager;
        this.bufferSize = propertiesManager.getInt(PropertyKeys.BUFFER_SIZE);
        this.port = propertiesManager.getInt(PropertyKeys.PORT);
        this.soTimeout = propertiesManager.getInt(PropertyKeys.TIMEOUT);
    }


    private void initServer() throws SocketException {
        this.running = true;
    }

    @Override
    public void run() {
        InetSocketAddress address = new InetSocketAddress("192.168.0.204", this.port);
        try {
            udp = new DatagramSocket(address);
            udp.setSoTimeout(soTimeout);
            byte[] buffer = new byte[bufferSize];
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
        this.running = false;
    }
}
