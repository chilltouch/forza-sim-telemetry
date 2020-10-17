package chilltouch.forza.sim.telemetry.utils;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;


public class PropertiesManager {

    private static PropertiesManager INSTANCE;

    private static final String PROP_FILE = "application.properties";

    private Properties properties;

    private PropertiesManager() throws IOException {
        this.properties = new Properties();
        loadProperties();
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
        return (Integer) this.getValue(key);
    }

    public Long getLong(String key) {
        return (Long) this.getValue(key);
    }

    public String getString(String key) {
        return (String) this.getValue(key);
    }
}
