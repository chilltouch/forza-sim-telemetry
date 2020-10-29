package chilltouch.forza.sim.telemetry.connectors.arduino;

import chilltouch.forza.sim.telemetry.connectors.Connector;
import chilltouch.forza.sim.telemetry.entity.ArduinoRequest;
import chilltouch.forza.sim.telemetry.utils.PropertiesManager;
import chilltouch.forza.sim.telemetry.utils.PropertyKeys;
import com.fazecast.jSerialComm.SerialPort;

public class ArduinoConnector implements Connector {
    private SerialPort port;
    private int baudRate;
    private PropertiesManager propertiesManager;

    public ArduinoConnector(PropertiesManager propertiesManager) {
        this.propertiesManager = propertiesManager;
        this.baudRate = propertiesManager.getInt(PropertyKeys.BAUD_RATE);
    }

    @Override
    public SerialPort[] getPorts() {
        return SerialPort.getCommPorts();
    }

    @Override
    public SerialPort connect(String port) {
        this.port = SerialPort.getCommPort(port);
        this.port.openPort();
        this.port.setBaudRate(this.baudRate);
        return this.port;
    }

    @Override
    public void sendData(ArduinoRequest message) {

    }

    @Override
    public void killConnection() {
        this.port.closePort();
    }
}
