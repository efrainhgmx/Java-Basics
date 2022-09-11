public class ConversionTipos {
    public static void main(String[] args) {

        String numeroStr = "50";

        int numeroInt = Integer.parseInt(numeroStr);
        System.out.println("numeroInt = " + numeroInt);

        String realnumber = "98453.43e-3";

        double realDouble = Double.parseDouble(realnumber);
        System.out.println("realDouble = " + realDouble);

        String booleanStr = "true";

        boolean booleanB = Boolean.parseBoolean(booleanStr);
        System.out.println("booleanB = " + booleanB);
    }

}
