public class OperadoresLogicos {
    public static void main(String[] args) {
        int i = 3;
        byte j = 7;

        boolean b = i < 4 && j > i;
        System.out.println("Valor b:  = " + b);
        
        boolean b1 = i == j || j < i;
        System.out.println("b1 = " + b1);
        
        boolean b2 = j == 7 && (i < 4 || i < j);
        System.out.println("b2 = " + b2);
    }
}
