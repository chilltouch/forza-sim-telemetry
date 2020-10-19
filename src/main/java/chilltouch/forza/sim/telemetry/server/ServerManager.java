package chilltouch.forza.sim.telemetry.server;

import chilltouch.forza.sim.telemetry.observers.Observer;
import chilltouch.forza.sim.telemetry.utils.PropertiesManager;

public class ServerManager implements Observer<PropertiesManager> {
    private PropertiesManager propertiesManager;
    private UDPServer server;

    public ServerManager(PropertiesManager propertiesManager) {
        this.propertiesManager = propertiesManager;
        this.server = new UDPServer(propertiesManager);
        this.propertiesManager.addObserver(this);
    }

    public void startServer() {
        this.server.startServer();
        this.server.start();
    }

    public void forceStop() {
        this.server.stopServer();
        this.server.destroyServer();
    }

    @Override
    public void observe(PropertiesManager object) {
        this.server.stopServer();
        this.server.destroyServer();
        this.server = new UDPServer(object);
        this.startServer();
    }
}
