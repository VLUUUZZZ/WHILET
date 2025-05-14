import javax.swing.JOptionPane;

public class CALCULADORA {
    public static void main(String[] args) {
        String num1 = JOptionPane.showInputDialog("Ingresa el primer número:");
        double a = Double.parseDouble(num1);

        String num2 = JOptionPane.showInputDialog("Ingresa el segundo número:");
        double b = Double.parseDouble(num2);

        double suma = a + b;
        double resta = a - b;
        double multiplicacion = a * b;
        double division = a / b;

        String resultado = "Suma: " + suma +
                          "\nResta: " + resta +
                          "\nMultiplicación: " + multiplicacion +
                          "\nDivisión: " + division;

        System.out.println("El resultado es: "+resultado);
    }
}
