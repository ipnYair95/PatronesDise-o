package memento;

/**
 * Aplicaciones
 * Historial de cambios en un documento para restaurar
 * Copias de seguridad de cambios en un objeto
 */

public class Ejemplo {
    public static void main(String[] args) {

        Originator originator = new Originator();
        CareTaker careTaker = new CareTaker();

        // vamos haciendo moficicaciones
        originator.setState("State #1");
        originator.setState("State #2");
        //en este punto guardamos este momento o tomamos un snapshot
        careTaker.add(originator.saveStateToMemento());

        //hacemos otra modificacion
        originator.setState("State #3");
        // guardamos nuevamente
        careTaker.add(originator.saveStateToMemento());

        originator.setState("State #4");
        //obtenemos el estado en el que se encuentra nuestro estado
        System.out.println("Current State: " + originator.getState());

        // de nuestra lista obtenemos como estaba el primer snapshot
        originator.getStateFromMemento(careTaker.get(0));
        System.out.println("First saved State: " + originator.getState());

        // de nuestra lista obtenemos como estaba el segundo snapshot
        originator.getStateFromMemento(careTaker.get(1));
        System.out.println("Second saved State: " + originator.getState());
    }
}
