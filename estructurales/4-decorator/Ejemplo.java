package decorator;

import decorator.decoradores.MayusculasDecorador;
import decorator.decoradores.ReversaDecorador;
import decorator.decoradores.SubrayadoDecorador;

public class Ejemplo {
    public static void main(String[] args) {
        Formateable texto = new Texto("Hola que tal");
        Formateable texto2 = new Texto("Hola que tal");


        MayusculasDecorador mayus = new MayusculasDecorador(texto);
        ReversaDecorador rd = new ReversaDecorador(mayus);
        SubrayadoDecorador sd = new SubrayadoDecorador(rd);

        System.out.println( sd.darFormato() );

        mayus = new MayusculasDecorador(texto2);
        System.out.println( mayus.darFormato() );
        


    }
}
