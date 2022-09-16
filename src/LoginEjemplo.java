import java.util.Scanner;

public class LoginEjemplo {
    public static void main(String[] args) {
        String[] usernames = new String[2];
        String[] pws = new String[2];
        String username = "efrainhgmx";
        String password = "m123456l";

        String username2 = "admin";
        String password2 = "123456";

        usernames[0] = username;
        pws[0] = password;

        usernames[1] = username2;
        pws[1] = password2;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese usuario");
        String uname = scanner.nextLine();

        System.out.println("Ingrese contraseña");
        String userpw = scanner.nextLine();

        boolean estaLogeado = false;

        for (int i = 0; i < usernames.length; i++){
            if(usernames[i].equals(uname) && pws[i].equals(userpw)) {
                estaLogeado = true;
                break;
            } else {
                System.out.println("Lo siento usario y password malos intenta otravez!!");
            }
        }

        if (!estaLogeado) {
            main(args);
        }
    }
}
