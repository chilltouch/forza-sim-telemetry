package chilltouch.forza.sim.telemetry;

import chilltouch.forza.sim.telemetry.server.UDPServer;

import java.net.SocketException;

public class Main {
    public static void main(String[] args) throws SocketException {
        UDPServer server = new UDPServer(12345, 1024);
        server.start();
    }
}
