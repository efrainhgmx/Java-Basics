import javax.swing.*;

public class MedidorGasolina {
    public static void main(String[] args) {
        String cantidadGasolina = JOptionPane.showInputDialog(null, "Introduce la cantidad de gasolina");
        int litrosDeGasolina = Integer.parseInt(cantidadGasolina);

        String tanque = "Tanque ";
        if(litrosDeGasolina >= 70) {
            tanque += "Lleno";
        } else if(litrosDeGasolina < 70 && litrosDeGasolina >= 60) {
            tanque += "casi lleno";
        } else if(litrosDeGasolina < 60 && litrosDeGasolina >= 40) {
            tanque += "a 3/4";
        } else if(litrosDeGasolina < 40 && litrosDeGasolina >= 35) {
            tanque += "a la mitad";
        } else if (litrosDeGasolina < 35 && litrosDeGasolina >= 20) {
            tanque += "con Gasolina Suficiente";
        } else if (litrosDeGasolina < 20) {
            tanque += "Insuficiente";
        }

        JOptionPane.showMessageDialog(null, tanque);

    }
}
