public class PrimitivosFloat {
   static float valorFlotante;
    public static void main(String[] args) {
        float realFloat = 1.5e-4f;
        System.out.println("realFloat = " + realFloat);
        System.out.println("Float corresponde en byte a: " + Float.BYTES);
        System.out.println("Float corresponde en bits a: " + Float.SIZE);
        System.out.println("Valor maximo: " + Float.MAX_VALUE);
        System.out.println("Valor minimo: " + Float.MIN_VALUE);

        double realDouble = 3.1416e39;
        System.out.println("realDouble = " + realDouble);
        System.out.println("Double corresponde en byte a: " + Double.BYTES);
        System.out.println("Double corresponde en bits a: " + Double.SIZE);
        System.out.println("Valor maximo: " + Double.MAX_VALUE);
        System.out.println("Valor minimo: " + Double.MIN_VALUE);

        var varFlotante = 3.1416;
        System.out.println("varFlotante = " + varFlotante);
        varFlotante = 3.1416e39;
        System.out.println("varFlotante = " + varFlotante);

        System.out.println(valorFlotante);

    }
}
