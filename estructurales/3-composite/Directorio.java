package composite;

import java.util.ArrayList;
import java.util.List;

public class Directorio extends Componente {

    private List<Componente> hijos;

    public Directorio(String nombre) {
        super(nombre);
        this.hijos = new ArrayList<>();
    }

    public Directorio addComponente(Componente c) {
        this.hijos.add(c);
        return this;
    }

    public void removeComponente(Componente c) {
        this.hijos.remove(c);
    }

    @Override
    public String mostrar(int nivel) {
        StringBuilder sb = new StringBuilder();
        sb.append("\t".repeat(nivel))
                .append(nombre)
                .append("/")
                .append("\n");
        for (Componente hijo : this.hijos) {

            sb.append( hijo.mostrar(+1) );
            if(  hijo instanceof Archivo){
                sb.append("\n");
            }

        }
        return sb.toString();
    }

    @Override
    public boolean buscar(String nombre) {
        if( this.nombre.equalsIgnoreCase(nombre) ){
            return true;
        }

        for (Componente hijo : this.hijos){
            if( hijo.buscar(nombre) ){
                return true;
            }
        }

        return false;
    }


}
