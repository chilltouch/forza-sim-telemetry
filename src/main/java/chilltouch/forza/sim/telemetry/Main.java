package chilltouch.forza.sim.telemetry;

import chilltouch.forza.sim.telemetry.server.UDPServer;

import java.net.SocketException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws SocketException {
        UDPServer server = new UDPServer(5690, 500);
        server.start();
        Scanner entry = new Scanner(System.in);
        System.out.println("Press any key to close");
        entry.next();
        server.stopServer();
    }
}
