public class Primitivos {
    public static void main(String[] args) {
        //Entero de 8 bits, entero más pequeño en java
        byte numeroByte = -128;
        System.out.println("byte: " + numeroByte);
        System.out.println("Cantidad de bytes en byte " + Byte.BYTES);
        System.out.println("Cantidad de bits en byte " + Byte.SIZE);
        System.out.println("Valor maximo: " + Byte.MAX_VALUE);
        System.out.println("Valor minimo: " + Byte.MIN_VALUE);

        short numeroShort = 30000;
        System.out.println("numeroShort = " + numeroShort);
        System.out.println("Cantidad de bytes en short " + Short.BYTES);
        System.out.println("Cantidad de bits en short " + Short.SIZE);
        System.out.println("Valor maximo: " + Short.MAX_VALUE);
        System.out.println("Valor minimo: " + Short.MIN_VALUE);

        int numeroInt = 32578;
        System.out.println("numeroInt = " + numeroInt);
        System.out.println("Cantidad de bytes en int " + Integer.BYTES);
        System.out.println("Cantidad de bits en int " + Integer.SIZE);
        System.out.println("Valor maximo: " + Integer.MAX_VALUE);
        System.out.println("Valor minimo: " + Integer.MIN_VALUE);


        long numeroLong = 125458755L;
        System.out.println("numeroLong = " + numeroLong);
        System.out.println("Cantidad de bytes en int " + Long.BYTES);
        System.out.println("Cantidad de bits en int " + Long.SIZE);
        System.out.println("Valor maximo: " + Long.MAX_VALUE);
        System.out.println("Valor minimo: " + Long.MIN_VALUE);

        //Var si se asigna un numero, siempre va a tomar el valor entero o del literal
        var numeroVar = 127;
        System.out.println("numeroVar = " + numeroVar);

    }
}
