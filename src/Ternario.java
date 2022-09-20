public class Ternario {
    public static void main(String[] args) {
        //FUNCIONA IGUAL QUE EN JAVASCRIPT

        int a = 7;
        int b = 10;

        String variable = a == b ? "Es verdadero" : "Es falso";

        System.out.println(a + " es igual a" + b);
        System.out.println(variable);

        int max = 100;
        int min = 0;

        String mensaje = (50 < max) && (50 > min ) ? "Valor valido" : "Valor fuera de rango";

        System.out.println(mensaje);
    }
}
