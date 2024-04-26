import javax.swing.JOptionPane;

public class Hipotenusa {
    public static void main(String[] args) {

        double x, y, z;

        x = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor de X"));
        y = Double.parseDouble(JOptionPane.showInputDialog("Agora o valor de Y"));

        // C = √(A^2 + B^2)
        z = Math.sqrt((x * x) + (y * y));
        String hipotenusa = String.format("%.2f", z);

        JOptionPane.showMessageDialog(null, "O valor da hipotenusa é: "+hipotenusa);
    }
}