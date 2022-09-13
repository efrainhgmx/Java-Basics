public class ExtensionArchivo {
    public static void main(String[] args) {

        String archivo = "index.json";
        int indexArchivo = archivo.lastIndexOf(".");

        System.out.println("Archivo con extension: " + archivo.substring(indexArchivo + 1));


    }
}
