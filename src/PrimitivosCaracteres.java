public class PrimitivosCaracteres {
    public static void main(String[] args) {
        //Char es con comillas simples
        char primitivoCaracter = 'A';
        char unicodeJava =  '\u0040';
        char demical = 64;
        System.out.println("primitivoCaracter = " + primitivoCaracter);
        System.out.println("unicodeJava = " + unicodeJava);
        System.out.println("demical = " + demical);
        System.out.println("decimal es igual a unicode?: " +  (unicodeJava == demical));

        char espacio = ' ';
        char tabulador = '\t';
        char retroceso = '\b';
        char nuevaLinea = '\n';
        char retornoCarro =  '\r';

        System.out.println("Char en byte: " + tabulador + espacio + Character.BYTES);
        System.out.println("Char en bits: " +  espacio +  Character.SIZE);
        System.out.println("Valor maximo: " +  espacio + Character.MAX_VALUE);
        System.out.println("Valor minimo: " +  espacio + Character.MIN_VALUE);

        System.out.println("Char en byte: " + retroceso + Character.BYTES);
        System.out.println("Char en byte: " + nuevaLinea + Character.BYTES);
        System.out.println("Char en byte: " + retornoCarro + Character.BYTES);
        
        var varChar = '\u0040';
        System.out.println("varChar = " + varChar);
    }
}
