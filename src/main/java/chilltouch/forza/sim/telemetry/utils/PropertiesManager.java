package chilltouch.forza.sim.telemetry.utils;

import chilltouch.forza.sim.telemetry.observers.Observable;
import chilltouch.forza.sim.telemetry.observers.Observer;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;


public class PropertiesManager implements Observable<PropertiesManager> {

    private static PropertiesManager INSTANCE;

    private final String PROP_FILE;

    private Properties properties;
    private List<Observer<PropertiesManager>> observers;

    private PropertiesManager() throws IOException {
        this.properties = new Properties();
        PROP_FILE = Paths.get("").toAbsolutePath().toString() + "/src/resources/application.properties";
        loadProperties();
        this.observers = new ArrayList<>();
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

    public void update(String key, Object value) throws IOException {
        Object obj = this.properties.getProperty(key);
        if (obj != null) {
            this.properties.remove(key);
        }

        this.properties.putIfAbsent(key, value);
        FileOutputStream out = new FileOutputStream(PROP_FILE);
        this.properties.store(out, null);
        this.emit(this);
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

    public Float getFloat(String key) {
        String value = this.getString(key);
        return Float.parseFloat(value);
    }

    public Double getDouble(String key) {
        String value = this.getString(key);
        return Double.parseDouble(value);
    }

    public Short getShort(String key) {
        String value = this.getString(key);
        return Short.parseShort(value);
    }

    public Boolean getBoolean(String key) {
        String value = this.getString(key);
        return Boolean.parseBoolean(key);
    }

    public String getString(String key) {
        return (String) this.getValue(key);
    }

    @Override
    public void emit(PropertiesManager obj) {
        observers.stream().forEach(o -> {
            o.observe(this);
        });
    }

    @Override
    public void addObserver(Observer<PropertiesManager> observer) {
        this.observers.add(observer);
    }

    @Override
    public void removeObserver(Observer<PropertiesManager> observer) {
        this.observers.remove(observer);
    }
}
