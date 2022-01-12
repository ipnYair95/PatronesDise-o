package singleton;

public class ConexionBdSingleton {

    private static ConexionBdSingleton instancia;

    private ConexionBdSingleton(){
        System.out.println("Conetandose a base...");

    }

    public static ConexionBdSingleton getInstancia(){

        if( !(instancia instanceof ConexionBdSingleton) ){
            instancia = new ConexionBdSingleton();
        }

        return instancia;
    }



}
