package memento;

import java.util.ArrayList;
import java.util.List;

/**
 * en este se guarda el historial de momentos
 */

public class CareTaker {
    private List<Memento> mementoList = new ArrayList<>();

    public void add(Memento state){
        mementoList.add(state);
    }

    public Memento get(int index){
        return mementoList.get(index);
    }
}
