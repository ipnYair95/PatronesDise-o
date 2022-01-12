package composite;

public class Ejemplo {
    public static void main(String[] args) {
        Directorio doc = new Directorio("Documentos");

        Directorio java = new Directorio("Java");
        java.addComponente( new Archivo("PatronComposite.docx"));

        Directorio stream = new Directorio("Api Stram");
        stream.addComponente(new Archivo("steam-map.docx"));

        java.addComponente( stream );
        doc.addComponente(java);
        doc.addComponente(new Archivo("CV.pdf"));
        doc.addComponente(new Archivo("logo.png"));

        System.out.println( doc.mostrar(0) );

    }
}
