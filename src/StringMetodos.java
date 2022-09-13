public class StringMetodos {
    public static void main(String[] args) {
        String nombre = "Efrain";
        int largoCadena = nombre.length();

        System.out.println("Largo de la cadena " + largoCadena);
        System.out.println("minuscula " + nombre.toLowerCase());
        System.out.println("MAYUSCULA " + nombre.toUpperCase());
        System.out.println("Compara es String " +  nombre.equals("Efrain"));
        System.out.println("Ignora mayus y minusculas " + nombre.equalsIgnoreCase("efraIN"));

        //Si el valor es 0 el string es identico ya que compara por medio de valores unicode
        System.out.println("Compara caracteres: " + nombre.compareTo("Efrain"));
        System.out.println("Compara caracteres: " + nombre.compareTo("Maicol"));
        System.out.println("Da el caracter por posicion: " + nombre.charAt(0));

        System.out.println("Obtener una parte del String: " + nombre.substring(0, 4));
        System.out.println("Ultimos dos caracteres: " + nombre.substring(nombre.length() - 2));
    }
}
