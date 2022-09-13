public class EjemploStringTest {
    public static void main(String[] args) {
        String a = "a";
        String b = "b";
        String c  = a;

        StringBuilder sb = new StringBuilder(a);

        long inicio = System.currentTimeMillis();

        for(int i = 0; i < 100000; i++) {
            //MENOS EFICIENTE EN MUCHOS STRINGS
            c = c.concat(a).concat(b).concat("\n");
            //c += a + b + "\n";

            //MAS EFICIENTE POR MUCHO
            //sb.append(a).append(b).append("\n");
        }

        long fin = System.currentTimeMillis();
        //System.out.println(c);
        System.out.println("Tiempo: "+ (fin - inicio));
    }
}
