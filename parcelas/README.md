## Exercício | Parcelas com **Java**

### Objetivo:
- Devo pegar o valor total de um produto e falar para o usuário se ele pode pagar parcelado ou não

- Para ele poder parcelar, o produto deve valer no mínimo R$ 1.000,00

- Caso mesmo pagando a parcela ainda falte alguma quantia, eu devo dizer o quanto falta

- Caso o produto seja menos de R$ 1.000,00 devo dizer que não é possível parcelar
<br></br>
---
### Explicação do Algoritmo:

1. Eu devo pedir o valor do produto, para isso usei o <span
    style="background:black; color:red; font-weight: bolder; padding: 5px; border-radius: 5px;">JOptionPane</span>:
    ```java
    import javax.swing.JOptionPane;

    public class Parcelas {

        public static void main(String[] args) {

            double valueTotal = Double.parseDouble(JOptionPane.showInputDialog("Qual o valor total do produto?: "));
            double parcelaMinima = 1000;
        }

    }
    ```
    <br></br>
    2. Eu dividi o valor do produto com o valor da parcela, e, peguei o menor arredondamento possível para ter a quantidade exata de parcelas que ele pode fazer:
    ```java
    int parcelas = (int) Math.floor(valueTotal / parcelaMinima);
    String converted = String.format("%.2f", valueTotal);
    ```
    <br></br>
    3. Eu programei uma mensagem para caso o valor inserido fosse menos do mínimo para poder pagar parcelado:
    ```java
    if (parcelas < 1 || parcelas == 0) {
        JOptionPane.showMessageDialog(null, "Não é possível fazer nenhuma parcela. Pois, o valor mínimo é \nR$ 1.000,00, mas, o valor total que você precisa pagar é R$ " + converted);
    }
    ```
    <br></br>
    4. Agora, caso não dê erro, eu programei primeiro duas variáveis vazias:

    - <span
    style="background:black; color:red; font-weight: bolder; padding: 5px; border-radius: 5px;">falta</span>: é a variável que diz o quanto falta para pagar mesmo pagando todas as parcelas
    - <span
    style="background:black; color:red; font-weight: bolder; padding: 5px; border-radius: 5px;">message</span>: é a variável que eu concatenarei todas as mensagens para depois mostrar
    
        E fiz um <span
    style="background:black; color:red; font-weight: bolder; padding: 5px; border-radius: 5px;">Loop for</span> para mostrarmos quantas parcelas terão:
    ```java
    if (parcelas < 1 || parcelas == 0) {
        JOptionPane.showMessageDialog(null, "Não é possível fazer nenhuma parcela. Pois, o valor mínimo é \nR$ 1.000,00, mas, o valor total que você precisa pagar é R$ " + converted);
    } else {
            double falta = 0;
            String message = "";

            for (int i = 1; i <= parcelas; i++) {
                message += i + "º parcela: R$ " + parcela + "\n";
                falta += parcela;
            }
        }
    ```
    <br></br>
    5. Para finalizar, eu fiz um Condicional para saber se faltava algum valor, e por fim mostrei todas as mensagens que eu havia concatenado:
    ```java
    if (parcelas < 1 || parcelas == 0) {
        JOptionPane.showMessageDialog(null, "Não é possível fazer nenhuma parcela. Pois, o valor mínimo é \nR$ 1.000,00, mas, o valor total que você precisa pagar é R$ " + converted);
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
    ```