public class EjemploStringConcatenacion {
    public static void main(String[] args) {
        String curso =  "Programación Java";
        String profesor = "Andrés Guzman";
        
        String detalle = curso + " con el profesor " + profesor;
        System.out.println("detalle = " + detalle);

        int numeroA = 25;
        int numeroB = 50;

        System.out.println(numeroA + numeroB);
        System.out.println(detalle + numeroA + numeroB);
        System.out.println(detalle +  (numeroA + numeroB));

        System.out.println("Detalle del curso ".concat(detalle));


        String detalleCurso =  curso.concat(" con ").concat(profesor);
        System.out.println(detalleCurso);
    }
}
