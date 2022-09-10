public class SistemasNumericos {
    public static void main(String[] args) {

        int numeroDecimal = 500;
        System.out.println("numeroDecimal = " + numeroDecimal);
        System.out.println("Numero Binario de = " + numeroDecimal + " es: "+ Integer.toBinaryString(numeroDecimal));

        //Indica que es un binario al compilador de Java
        int numeroBinario = 0b111110100;
        System.out.println("numeroBinario = " + numeroBinario);
        System.out.println("Numero Octal de 500 es: " + Integer.toOctalString(numeroBinario));

        //El 0 al inicio muestra inidca que es un octal
        int numeroOctal = 0764;
        System.out.println("numeroOctal = " + numeroOctal);

        System.out.println("Numero Hexadecimal de 500: " + Integer.toHexString(numeroDecimal));
        
        int numeroHex = 0x1f4;
        System.out.println("numeroHex = " + numeroHex);
    }
}
