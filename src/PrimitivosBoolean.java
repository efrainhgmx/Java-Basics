public class PrimitivosBoolean {
    public static void main(String[] args) {
        //Es util para una estructura de control
        boolean datoLogico = true;
        boolean datoFalso = Boolean.FALSE.booleanValue();
        System.out.println("datoLogico = " + datoLogico);
        System.out.println("datoFalso = " + datoFalso);

        double d = 84571e-3; //84.5713
        float f = 1.23547e4f; // 12354.74

        datoLogico = d > f;
        System.out.println("Dato es = " + datoLogico);
        
        int valorUno = 125;
        float valorDos = 0125;
        var valorVar = 0125;
        System.out.println("valorUno = " + valorUno);
        System.out.println("valorDos = " + valorDos);
        System.out.println("valorVar = " + valorVar);
    }
}
