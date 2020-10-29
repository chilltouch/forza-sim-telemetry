package chilltouch.forza.sim.telemetry;

import chilltouch.forza.sim.telemetry.server.ServerManager;
import chilltouch.forza.sim.telemetry.utils.PropertiesManager;
import com.fazecast.jSerialComm.SerialPort;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        PropertiesManager propertiesManager = PropertiesManager.getManagerInstance();

        ServerManager manager = new ServerManager(propertiesManager);
        manager.startServer();

        SerialPort serialPort = SerialPort.getCommPort("COM3");
        try {
            serialPort.openPort();//Open serial port
            serialPort.setBaudRate(9600);
            byte[] test = "Hello from Java".getBytes();
            serialPort.writeBytes(test, test.length);//Write data to port
            serialPort.closePort();//Close serial port
        } catch (Error ex) {
            System.out.println(ex);
        }

        Scanner entry = new Scanner(System.in);
        System.out.println("Press any key to close");
        entry.nextLine();
        manager.forceStop();
    }
}
