public class OperadorUnario {
    public static void main(String[] args) {
        int i = -5;
        int j = +i;
        int k = -j;

        System.out.println("j = " + j);
        System.out.println("k = " + k);
        
        int incremento = ++i; // i = i + 1;
        System.out.println("incremento = " + incremento);
        
    }
}
