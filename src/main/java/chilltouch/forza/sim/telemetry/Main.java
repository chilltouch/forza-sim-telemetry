package chilltouch.forza.sim.telemetry;

import chilltouch.forza.sim.telemetry.server.ServerManager;
import chilltouch.forza.sim.telemetry.utils.PropertiesManager;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        PropertiesManager propertiesManager = PropertiesManager.getManagerInstance();

        ServerManager manager = new ServerManager(propertiesManager);
        manager.startServer();

        Scanner entry = new Scanner(System.in);
        System.out.println("Press any key to close");
        entry.nextLine();
        manager.forceStop();
    }
}
