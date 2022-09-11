public class EjemploStringInmutable {
    public static void main(String[] args) {
        String curso =  "Programación Java";
        String profesor = "Andrés Guzman";

        String resultado  = curso.concat(profesor);

        System.out.println("Curso " + curso);

        String resultadoMutable = curso.transform( c -> {
            return c + " con " + profesor;
        });

        System.out.println(resultadoMutable);
        System.out.println(resultado.replace("P", "D"));

        System.out.println("resultado = " + resultado);
    }
}
