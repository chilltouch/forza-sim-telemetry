package chilltouch.forza.sim.telemetry.observers;

public interface Observable<T> {
    public void emit(T obj);
    public void addObserver(Observer<T> observer);
    public void removeObserver(Observer<T> observer);
}
