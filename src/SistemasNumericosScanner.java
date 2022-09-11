import javax.swing.*;
import java.util.InputMismatchException;
import java.util.Scanner;

public class SistemasNumericosScanner {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el numero entero");

        int numeroDecimal = 0;
        try {
            numeroDecimal = scanner.nextInt();

        } catch (InputMismatchException e) {
            System.out.println("Debe colocar un numero entero valido");
            main(args);
            System.exit(0);
        }

        String resutaldoBinario = "Numero Binario de = " + numeroDecimal + " es: "+ Integer.toBinaryString(numeroDecimal);
        String resultadoOctal = "\nNumero Octal de = " + numeroDecimal + " es: "+ Integer.toOctalString(numeroDecimal);
        String resultadoHex = "\nNumero Hexadecimal de " + numeroDecimal + " es " + Integer.toHexString(numeroDecimal);


        String mensaje = resutaldoBinario;
        mensaje += resultadoOctal;
        mensaje += resultadoHex;

        System.out.println(mensaje);
    }
}
