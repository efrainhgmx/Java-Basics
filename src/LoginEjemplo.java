import java.util.Scanner;

public class LoginEjemplo {
    public static void main(String[] args) {
        String username = "efrainhgmx";
        String password = "m123456l";

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese usuario");
        String uname = scanner.nextLine();

        System.out.println("Ingrese contraseña");
        String userpw = scanner.nextLine();

        boolean estaLogeado = false;

        if(uname.equals(username) && userpw.equals(password)) {
            estaLogeado = true;
        } else {
            System.out.println("Lo siento usario y password malos intenta otravez!!");
        }

        if (!estaLogeado) {
            main(args);
        }
    }
}
