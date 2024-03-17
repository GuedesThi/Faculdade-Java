package funcionario;

public class Funcionario {
    public String name;
    public int age;
    public double[] salario;

    public void informations() {
        System.out.println("\nINFORMAÇÕES SOBRE O FUNCIONÁRIO:");
        System.out.println("Nome: " + this.name);
        System.out.println("Idade: " + this.age);

        String first = String.format("%.3f", this.salario[0]);
        String second = String.format("%.3f", this.salario[1]);
        String third = String.format("%.3f", this.salario[2]);
        System.out.printf("Salários: R$ %s | R$ %s | R$ %s\n", first, second, third);
        System.out.println("-----------------------------------");
    }

    public void media(double... salarios) {
        double total = 0;

        for (double i: salarios) {
            total += i;
        }

        total /= 2;

        System.out.printf("Sua média salarial é de: R$ %.3f\n\n", total);
     }
}