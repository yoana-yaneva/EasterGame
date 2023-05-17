import java.util.ArrayList;
import java.util.List;

public class Basket {
    private List<Egg> eggs = new ArrayList<>();
    private List<Observer> observers = new ArrayList<>();

    public void addEgg(Egg egg) {
        eggs.add(egg);
        notifyObservers();
    }

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    private void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(eggs.size());
        }
}
}
