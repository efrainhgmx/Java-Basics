public class Caracteres {
    public static void main(String[] args) {
        //Char es con comillas simples
        char primitivoCaracter = 'A';
        char unicodeJava =  '\u0040';
        char demical = 64;
        System.out.println("primitivoCaracter = " + primitivoCaracter);
        System.out.println("unicodeJava = " + unicodeJava);
        System.out.println("demical = " + demical);
        System.out.println("decimal es igual a unicode?: " +  (unicodeJava == demical));

        System.out.println("Char en byte: " + Character.BYTES);
        System.out.println("Char en bits: " + Character.SIZE);
        System.out.println("Valor maximo: " + Character.MAX_VALUE);
        System.out.println("Valor minimo: " + Character.MIN_VALUE);
        
        var varChar = '\u0040';
        System.out.println("varChar = " + varChar);
    }
}
