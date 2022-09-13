import java.util.Scanner;

public class ManejoDeNombres {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String primerNombre = null;
        String segundoNombre = null;
        String tercerNombre = null;

        System.out.println("Escribe el primer nombre");
        primerNombre = scanner.nextLine();
        System.out.println("Escribe el segundo nombre");
        segundoNombre = scanner.nextLine();
        System.out.println("Escribe el tercer nombre");
        tercerNombre = scanner.nextLine();

        if(!primerNombre.isBlank() && !segundoNombre.isBlank() && !tercerNombre.isBlank()) {
            System.out.println("Nombres: " + primerNombre + " " + segundoNombre  + " " + tercerNombre);

            char letraUno = primerNombre.toUpperCase().charAt(1);
            char letraDos = segundoNombre.toUpperCase().charAt(1);
            char letraTres = tercerNombre.toUpperCase().charAt(1);

            String extensionUno = primerNombre.toLowerCase().substring(primerNombre.length() - 2);
            String extensionDos = segundoNombre.toLowerCase().substring(segundoNombre.length() - 2);
            String extensionTres = tercerNombre.toLowerCase().substring(tercerNombre.length() - 2);

            System.out.println(letraUno + "." + extensionUno + "_" + letraDos + "." + extensionDos + "_" + letraTres + "." + extensionTres);

        } else  {
            System.out.println("Ingresa los nombres de nuevo");
            main(args);
        }
    }
}
