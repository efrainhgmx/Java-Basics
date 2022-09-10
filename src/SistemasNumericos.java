import javax.swing.*;

public class SistemasNumericos {
    public static void main(String[] args) {

        String numeroStr = JOptionPane.showInputDialog(null, "Ingrese el numero entero");
        int numeroDecimal = 0;
        try {
            numeroDecimal = Integer.parseInt(numeroStr);

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Debe colocar un numero entero valido");
            main(args);
            System.exit(0);
        }
        System.out.println("numeroDecimal = " + numeroDecimal);
        String resutaldoBinario = "Numero Binario de = " + numeroDecimal + " es: "+ Integer.toBinaryString(numeroDecimal);
        System.out.println(resutaldoBinario);

        //Indica que es un binario al compilador de Java
        int numeroBinario = 0b111110100;
        System.out.println("numeroBinario = " + numeroBinario);
        String resultadoOctal = "\nNumero Octal de = " + numeroDecimal + " es: "+ Integer.toOctalString(numeroDecimal);
        System.out.println(resultadoOctal);

        //El 0 al inicio muestra inidca que es un octal
        int numeroOctal = 0764;
        System.out.println("numeroOctal = " + numeroOctal);

        String resultadoHex = "\nNumero Hexadecimal de " + numeroDecimal + " es " + Integer.toHexString(numeroDecimal);

        System.out.println(resultadoHex);
        
        int numeroHex = 0x1f4;
        System.out.println("numeroHex = " + numeroHex);

        String mensaje = resutaldoBinario;
        mensaje += resultadoOctal;
        mensaje += resultadoHex;
        JOptionPane.showMessageDialog(null, mensaje);
    }
}
