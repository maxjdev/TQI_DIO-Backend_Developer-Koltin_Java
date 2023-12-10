package idade_planetaria;
import java.util.Scanner;

// Para ler e escrever dados em Java, aqui na DIO padronizamos da seguinte forma:
// - new Scanner(System.in): cria um leitor de Entradas, com métodos úteis com prefixo "next";
// - System.out.println:.imprime um texto de Saída (Output) e pulando uma linha.

public class IdadePlanetaria {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double idadeTerrestre = scanner.nextDouble();
        String planeta = scanner.next();

        String nomeDoPlaneta = "";
        double idadeEquivalente =0.0;

        switch (planeta.toLowerCase()) {
            case "marte":
                idadeEquivalente = idadeTerrestre / 1.88;
                nomeDoPlaneta = "Marte";
                break;
            case "venus":
                idadeEquivalente = idadeTerrestre / 0.62;
                nomeDoPlaneta = "Venus";
                break;
            case "jupiter":
                idadeEquivalente = idadeTerrestre / 11.86;
                nomeDoPlaneta = "Jupiter";
                break;
            default:
                System.out.println("Planeta invalido.");
                System.exit(0);
        }

        System.out.printf("Idade equivalente em %s: %.2f anos", nomeDoPlaneta, idadeEquivalente);

        scanner.close();
    }
}