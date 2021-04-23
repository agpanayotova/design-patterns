package observer;

import java.util.ArrayList;
import java.util.List;

public class ObservableImpl implements Observable{

    List<Observer> observers = new ArrayList<Observer>();

    @Override
    public void add(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void remove(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void sendNotification(T notification) {
        observers.forEach(observer -> observer.notify(notification));
    }
}
