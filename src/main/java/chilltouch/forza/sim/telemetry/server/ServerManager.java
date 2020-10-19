package chilltouch.forza.sim.telemetry.server;

import chilltouch.forza.sim.telemetry.observers.Observer;
import chilltouch.forza.sim.telemetry.utils.PropertiesManager;

public class ServerManager implements Observer<PropertiesManager> {
    private PropertiesManager propertiesManager;
    private UDPServer server;

    public ServerManager(PropertiesManager propertiesManager) {
        this.propertiesManager = propertiesManager;
        this.server = new UDPServer(propertiesManager);
    }

    public void startServer() {
        this.server.startServer();
        this.server.start();
    }

    @Override
    public void observe(PropertiesManager object) {
        System.out.println("Properties were changed\nStopping the server");
        this.server.stopServer();
        this.server = new UDPServer(object);
        this.server.start();
    }
}
