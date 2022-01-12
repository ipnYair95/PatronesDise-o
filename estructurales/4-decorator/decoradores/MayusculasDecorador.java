package decorator.decoradores;

import decorator.Formateable;

public class MayusculasDecorador  extends  TextoDecorador{

    public MayusculasDecorador(Formateable texto) {
        super(texto);
    }

    @Override
    public String darFormato() {
        return texto.darFormato().toUpperCase();
    }
}
