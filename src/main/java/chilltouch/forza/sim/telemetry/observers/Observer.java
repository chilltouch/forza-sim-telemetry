package chilltouch.forza.sim.telemetry.observers;

public interface Observer<T> {
    public void observe(T object);
}
