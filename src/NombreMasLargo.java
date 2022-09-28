import javax.swing.*;

public class NombreMasLargo {
    public static void main(String[] args) {
       String nombreUno = JOptionPane.showInputDialog(null, "Dame el primer nombre");
       String nombreDos = JOptionPane.showInputDialog(null, "Dame otro nombre");
       String nombreTres = JOptionPane.showInputDialog(null, "Ultimo nombre");

       int largoUno = nombreUno.replace(" ", "").length();
       int largoDos = nombreDos.replace(" ", "").length();
       int largoTres = nombreTres.replace(" ", "").length();

       String nombreLargo =  null;

       if(largoUno > largoDos && largoUno > largoTres) {
           nombreLargo = nombreUno + " tiene el nombre más largo";
       } else if(largoDos > largoUno && largoDos > largoTres) {
           nombreLargo = nombreDos + " tiene el nombre más largo";
       } else if(largoTres > largoDos && largoTres > largoUno) {
           nombreLargo = nombreTres + " tiene el nombre más largo";
       } else {
           nombreLargo = "Tienen el mismo tamaño";
       }

       JOptionPane.showMessageDialog(null, nombreLargo);

    }
}
