import java.io.*;

class FicheroObj  {
    static <T> void  fileOutputStream(T objeto, String nombre) { //

        File ficheroObjeto = new File("src\\Ficheros\\", nombre);
        try {
            FileOutputStream file = new FileOutputStream(ficheroObjeto, true);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(file);
            objectOutputStream.writeObject(objeto);
            objectOutputStream.close();
        } catch (IOException ex) {
            System.out.println("No se ha podido escribir en el fichero");

        }

    }
}
