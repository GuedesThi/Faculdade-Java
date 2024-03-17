package funcionario;

public class Main {
    public static void main(String[] args) {
        Funcionario t = new Funcionario();

        t.name = "Thiago dos Santos Guedes";
        t.age = 19;
        t.salario = new double[]{3.675, 2.050, 3.000};

        t.informations();
        t.media(t.salario);
    }
}