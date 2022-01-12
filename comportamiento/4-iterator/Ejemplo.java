package iterator;

/*
 * Aplicaciones
 * Para base de datos usamos esto en una consulta ya que no sabemos cuanto puede regresar
 * Simplemente para recorrer alguna coleccion sin necesidad de usar un for o indice que intermente ya lo usa
 * */

public class Ejemplo {
    public static void main(String[] args) {
        NameRepository namesRepository = new NameRepository();

        /*
        * preguntamos si hay elementos que leer y si es asi, obtenemos el objeto a leer
        * */
        for(Iterator iter = namesRepository.getIterator(); iter.hasNext();){
            String name = (String)iter.next();
            System.out.println("Name : " + name);
        }
    }
}
