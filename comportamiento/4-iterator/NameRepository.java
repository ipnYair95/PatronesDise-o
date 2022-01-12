package iterator;

public class NameRepository implements Container {
    public String names[] = {"Robert" , "John" ,"Julie" , "Lora"};

    @Override
    public Iterator getIterator() {
        return new NameIterator();
    }

    /**
     * metodos para controlar el interador si existe un siguiente y si es asi
     * movemos el puntero
     */

    private class NameIterator implements Iterator {

        int index;

        /**
         * verificamos si hay algo que leer
         * @return true o false
         */

        @Override
        public boolean hasNext() {

            if(index < names.length){
                return true;
            }
            return false;
        }

        /**
         *
         * @return devolvemos el objeto unicamente
         */

        @Override
        public Object next() {

            if(this.hasNext()){
                return names[index++];
            }
            return null;
        }
    }
}
