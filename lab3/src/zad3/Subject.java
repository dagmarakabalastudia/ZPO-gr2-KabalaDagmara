package zad3;

public interface Subject {
    public void register(Observer o);
    public void unregister();
    public void notifyObserver();
}
