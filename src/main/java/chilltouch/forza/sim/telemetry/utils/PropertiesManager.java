package chilltouch.forza.sim.telemetry.utils;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.Properties;


public class PropertiesManager {

    private static PropertiesManager INSTANCE;

    private final String PROP_FILE;

    private Properties properties;

    private PropertiesManager() throws IOException {
        this.properties = new Properties();
        PROP_FILE = Paths.get("").toAbsolutePath().toString() + "/src/resources/application.properties";
        loadProperties();
        System.out.println(PROP_FILE);
    }

    private void loadProperties() throws IOException {
        File file = new File(PROP_FILE);
        FileReader fileReader = new FileReader(file);
        properties.load(fileReader);
    }

    public static PropertiesManager getManagerInstance() throws IOException {

        if (INSTANCE == null) {
            INSTANCE = new PropertiesManager();
        }

        return INSTANCE;
    }

    public Object getValue(String key) {
        return this.properties.getProperty(key);
    }

    public Integer getInt(String key) {
        String value = this.getString(key);
        return Integer.parseInt(value);
    }

    public Long getLong(String key) {
        String value = this.getString(key);
        return Long.parseLong(value);
    }

    public String getString(String key) {
        return (String) this.getValue(key);
    }
}
