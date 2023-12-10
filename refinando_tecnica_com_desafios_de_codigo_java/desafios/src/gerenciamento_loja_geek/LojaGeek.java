package gerenciamento_loja_geek;
import java.util.Scanner;

// Para ler e escrever dados em Java, aqui na DIO padronizamos da seguinte forma:
// - new Scanner(System.in): cria um leitor de Entradas, com métodos úteis com prefixo "next";
// - System.out.println:.imprime um texto de Saída (Output) e pulando uma linha.

public class LojaGeek {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double media = scanner.nextDouble();

        //TODO: Verifique a média lida e imprima a avaliação do funcionário.
        if (media <= 4) {
            System.out.println("REP");
        } else if (media < 7) {
            System.out.println("MED");
        } else {
            System.out.println("APR");
        }
    }
}