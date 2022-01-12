package observer;

import java.util.ArrayList;
import java.util.List;

abstract public class Observable {

    //observadores que para subscribir
    protected List<Observer> observers = new ArrayList<>();

    //añadimos un observador
    public void addObserver(Observer o){
        observers.add(o);
    }

    public void notifyObservers(){
        notifyObservers(null);
    }

     // por cada observador notificamos
    public  void notifyObservers(Object obj){
        for (Observer obs: this.observers){
            obs.update(this, obj);
        }
    }

}
