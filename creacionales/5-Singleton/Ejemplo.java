package singleton;

public class Ejemplo {
    public static void main(String[] args) {
        ConexionBdSingleton con = null;
                
        for (int i = 0; i < 10; i++){
            con = ConexionBdSingleton.getInstancia();
            System.out.println("con = " + con);
        }

        ConexionBdSingleton con2 = ConexionBdSingleton.getInstancia();
        ConexionBdSingleton con3 = ConexionBdSingleton.getInstancia();
        
        boolean b1 = ( (con == con2) && (con2 == con3) ) ;
        System.out.println("b1 = " + b1);
        
    }
}

