public class OperdorInstanceOf {
    public static void main(String[] args) {

        //SIMILAR A typeof en JS pero aqui retorna un boolean pero si este es falso truena.
        String texto = "Hello this is a text without class";
        String txt = new String("Texto con contructor");

        Integer num = 7;

        boolean tipo =  texto instanceof String;

        System.out.println("tipo = " + tipo);

        boolean tipo2 = texto instanceof Object;
        System.out.println("tipo2 = " + tipo2);

        tipo = num instanceof Number;
        System.out.println(tipo);

        Object text = "Texto de la clase root Object";

        tipo = text instanceof Integer;
        System.out.println(tipo);

        //Todos los numeros en java son del tipo number
        Number nu = 12;

        tipo = nu instanceof Long;
        System.out.println(tipo);


    }
}
