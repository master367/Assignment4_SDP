package part3;

import java.util.ArrayList;
import java.util.List;

public class NewsAgency implements Observable{
    private List<Observer> observers = new ArrayList<>();
    private String headline;

    // Add an observer to the list
    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    // Remove an observer from the list
    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    // Notify all observers of the latest headline
    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(headline);
        }
    }

    // Set a new headline and notify observers
    public void setHeadline(String headline) {
        this.headline = headline;
        notifyObservers();
    }
}
