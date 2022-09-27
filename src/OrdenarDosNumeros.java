import java.util.Scanner;

public class OrdenarDosNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Vamos a ordernar dos numeros de mayor a menor");

        System.out.println("Dame el primer Numero: ");
        int numberOne = scanner.nextInt();

        System.out.println("Dame el segundo Numero: ");
        int numberTwo = scanner.nextInt();

        String order = "El orden es: ";

        String ordenFinal = (numberOne >= numberTwo) 
                ? order + numberOne + ", " + numberTwo 
                : order +  numberTwo + ", " + numberOne;

        System.out.println("ordenFinal = " + ordenFinal);

    }
}
