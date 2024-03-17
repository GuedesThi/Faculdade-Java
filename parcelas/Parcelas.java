package parcelas;
import javax.swing.JOptionPane;

public class Parcelas {

    public static void main(String[] args) {

        // Parcela mínima de 1000
        double valueTotal = Double.parseDouble(JOptionPane.showInputDialog("Qual é o valor do produto?: "));
        double parcela = 1000;

        int parcelas = (int) Math.floor(valueTotal / parcela);
        String converted = String.format("%.2f", valueTotal);

        if (parcelas < 1 || parcelas == 0) {
            JOptionPane.showMessageDialog(null, "Não é possível fazer nenhuma parcela. Pois, o valor mínimo é \nR$ 1.000,00, mas, " +
                    "o valor total que você precisa pagar é R$ " + converted);
        } else {
            double falta = 0;
            String message = "";

            for (int i = 1; i <= parcelas; i++) {
                message += i + "º parcela: R$ " + parcela + "\n";
                falta += parcela;
            }

            if (falta != valueTotal) {
                falta = valueTotal - falta;
                message += "Você ainda deve R$ " + falta;
            }

            JOptionPane.showMessageDialog(null, message.toString());
        }
    }
}
