import javax.swing.*;

public class OperadorAritmetico {
    public static void main(String[] args) {
        int i = 5,
            j = 4,
            suma = i + j;

        System.out.println("suma = " + suma);
        
        int resta = i - j;
        System.out.println("resta = " + resta);

        int multiplicacion = i * j;
        System.out.println("multiplicacion = " + multiplicacion);

        //Casteo para mostrar el resultado
        float division = (float) i / j;
        System.out.println("division = " + division);
        
        int resto = i % j;
        System.out.println("resto = " + resto);

        int numero = Integer.parseInt(JOptionPane.showInputDialog("Ingresa un numero sin decimal"));
        if (numero % 2 == 0) {
            System.out.println("Numero par:  = " + numero);
        } else  {
            System.out.println("Numero impar: " + numero);
        }


    }
}
