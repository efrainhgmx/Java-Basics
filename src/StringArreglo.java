public class StringArreglo {
    public static void main(String[] args) {
        String trabalenguas = "Trabalaneguas";

        char[] arreglo = trabalenguas.toCharArray();
        int largo = arreglo.length;

        for(int i = 0; i < largo; i++) {
            System.out.println(arreglo[i]);
        }

        String[] arr = trabalenguas.split("a");

        for (String s : arr) {
            System.out.println(s);
        }

        String archivo = "model.interface.ts";

        String[] archivoList = archivo.split("\\.");

        for(String s : archivoList) {
            System.out.println("Archivo TS" + s);
        }
    }
}
