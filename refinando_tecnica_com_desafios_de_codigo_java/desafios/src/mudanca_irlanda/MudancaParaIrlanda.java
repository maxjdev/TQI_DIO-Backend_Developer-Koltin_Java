package mudanca_irlanda;
import java.util.Scanner;
// Para ler e escrever dados em Java, aqui na DIO padronizamos da seguinte forma:
// - new Scanner(System.in): cria um leitor de Entradas, com métodos úteis com prefixo "next";
// - System.out.println:.imprime um texto de Saída (Output) e pulando uma linha.

public class MudancaParaIrlanda {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Leitura do salário e dos benefícios
        double salarioBruto = input.nextDouble();
        double beneficios = input.nextDouble();

        double imposto = calculaImposto(salarioBruto);
        //TODO: Implemente as regras para o cálculo do imposto.

        // Cálculo do salário líquido
        double salarioLiquido = salarioBruto - imposto + beneficios;

        //TODO: Imprimir o salário líquido com 2 casas decimais.
        System.out.printf("%.2f%n", salarioLiquido);
    }

    private static Double calculaImposto(double salarioBruto) {
        if (salarioBruto <= 1100.00) {
            return salarioBruto * 0.05;
        } else if (salarioBruto <= 2500.00) {
            return salarioBruto * 0.10;
        } else {
            return salarioBruto * 0.15;
        }
    }
}