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

    public UDPServer(PropertiesManager propertiesManager) {
        this.propertiesManager = propertiesManager;
        this.bufferSize = propertiesManager.getInt(PropertyKeys.BUFFER_SIZE);
        this.port = propertiesManager.getInt(PropertyKeys.PORT);
        this.soTimeout = propertiesManager.getInt(PropertyKeys.TIMEOUT);
    }

    public void startServer() {
        this.running = true;
    }

    @Override
    public void run() {
        InetSocketAddress address = null;
        try {
            address = new InetSocketAddress(InetAddress.getLocalHost(), this.port);
        } catch (UnknownHostException e) {
            System.out.println("cannot get local host address, server is dieing");
        }
        try {
            udp = new DatagramSocket(address);
            udp.setSoTimeout(soTimeout);
            byte[] buffer = new byte[bufferSize];
            DatagramPacket packet = new DatagramPacket(buffer, buffer.length);
            System.out.println("Server is started....");
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
        destroyServer();
        System.out.println("Server is stopped");
    }

    public void destroyServer() {
        this.udp.disconnect();
        this.udp.close();
    }

    public void stopServer() {
        this.running = false;
    }
}
