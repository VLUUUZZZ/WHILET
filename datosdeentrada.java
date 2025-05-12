import javax.swing.JOptionPane;

public class datosdeentrada {
    public static void main(String[] args) {
        String nombre = JOptionPane.showInputDialog("Ingresa tu nombre:");
        String apellido = JOptionPane.showInputDialog("Ingresa tu apellido:");

        String mensaje = "Hola, " + nombre + " " + apellido + "!";
        JOptionPane.showMessageDialog(null, mensaje);
    }
}
