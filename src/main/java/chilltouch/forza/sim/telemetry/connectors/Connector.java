package chilltouch.forza.sim.telemetry.connectors;

import chilltouch.forza.sim.telemetry.entity.ArduinoRequest;
import com.fazecast.jSerialComm.SerialPort;

public interface Connector {
    public SerialPort[] getPorts();
    public SerialPort connect(String port);
    public void sendData(ArduinoRequest message);
    public void killConnection();
}
