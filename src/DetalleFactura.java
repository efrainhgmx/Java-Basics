import java.util.InputMismatchException;
import java.util.Scanner;

public class DetalleFactura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce el nombre de la factura: ");
        String nombreFactura = scanner.nextLine();

        double iva = 0.19;
        double precioProductoUno = 0;
        double precioProductoDos = 0;
        try {
            System.out.println("Introduce el precio del productor uno: ");
             precioProductoUno = scanner.nextDouble();
            System.out.println("Introduce el precio del productor dos: ");
             precioProductoDos = scanner.nextDouble();
        } catch (InputMismatchException e) {
            System.out.println("El precio del producto uno o dos no tienen un formato valido por favor vuelve a ingresar la factura");
            main(args);
            System.exit(0);
        }


        double totalBruto = precioProductoUno + precioProductoDos;
        double valorTotal =  (totalBruto * iva) + totalBruto;

        String factura = "La Factura " + nombreFactura + " tiene un total bruto de " + totalBruto + " que ajustantdo el iva de 19% el total seria de  " + valorTotal;
        System.out.println(factura);
    }
}
