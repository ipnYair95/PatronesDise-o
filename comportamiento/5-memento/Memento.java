package memento;

/**
 * lo usamos simplemente para poder almacenar el estado
 * a ser restaurado
 */

public class Memento {
    private String state;

    public Memento(String state){
        this.state = state;
    }

    public String getState(){
        return state;
    }
}