package observer.ejemplo;

import observer.Corporacion;

/**
 * Aplicaciones
 * En angular se usan para peticiones http, especialmente si el back emite cambios seguidamente
 * En una aplicacion diversos componentes pueden escuchar los cambios que ocurre en otro para usar su informacion como
 * en una grafica
 */

public class Ejemplo2 {
    public static void main(String[] args) {
        Corporacion google = new Corporacion("Google", 1000);

        //agregamos observadores que estaran escuchando la corporacion

        google.addObserver( (observable, obj) -> {
            System.out.println("John: " + observable );
        });

        google.addObserver((observable, obj) -> {
            System.out.println("Andrés: " + observable );
        });

        google.addObserver((observable, obj) -> {
            System.out.println("Maria: " + observable );
        });

        //hacemos dos cambios y los observaodres van a imprimir la informacion dos veces por cada uno ya que se les notificó
        //donde pueden extraer la informacion de la corporacion o su estado actual

        google.modificaPrecio(2000);
        google.modificaPrecio(1000);
    }
}
