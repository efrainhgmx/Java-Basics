public class OperadorAsignacion {
    public static void main(String[] args) {

        int i  = 5;
        int j = i + 4; //9

        i = i + 2; //7
        i+= j; //16

        System.out.println(i); 
        
        j *= 1;
        j -= 1;
        j /= 2;

        System.out.println("j = " + j);

        String sqlString = "select *  from cursos as c";

        sqlString += " where c.nombre = Java";
        sqlString += " and c.activos = 1";

        System.out.println("sqlString = " + sqlString);
    }
}
