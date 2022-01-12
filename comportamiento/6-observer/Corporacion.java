package observer;

public class Corporacion extends Observable {

    private String nombre;
    private int precio;

    public Corporacion(String nombre, int precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public int getPrecio() {
        return precio;
    }

    //cada que se modifica el precio notificamos a los observadores del cambio
    public void modificaPrecio(int valor){
        this.precio = valor;
        notifyObservers();
    }

    @Override
    public String toString() {
        return "Corporacion{" +
                "nombre='" + nombre + '\'' +
                ", precio=" + precio +
                '}';
    }
}
