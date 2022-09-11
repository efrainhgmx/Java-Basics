import java.sql.SQLOutput;

public class EjemploString {
    public static void main(String[] args) {
        String curso =  "Programación Java";
        String curso2 = "Programación Java";
        
        boolean esMismaReferencia =  curso == curso2;
        System.out.println("esMismaReferencia = " + esMismaReferencia);
        String otroCurso = new String("Programación Java");
        boolean igual = curso == otroCurso;

        igual = curso.equals(otroCurso);

        System.out.println(igual);

        String nombre = "Ellen";

        //Ignora si unos es minuscula o mayuscula
        igual = nombre.equalsIgnoreCase("ellen");
        System.out.println(igual);

    }
}
