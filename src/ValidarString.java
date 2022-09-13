public class ValidarString {
    public static void main(String[] args) {
        String curso = null;

        boolean esNulo = curso == null;

        if(esNulo || curso.isBlank()) {
            curso = "Java";
            //isEmpty(), evalua si es un string vacio
            //isBlank(), es una manera más optima de evaluar ya que sabe si hay espacios en blanco
        }

        System.out.println("Bievenidos al curso de: " +  curso);
    }
}
