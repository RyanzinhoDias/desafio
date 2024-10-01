import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("--- Verifique a existência na sequência de Fibonacci.---");
        System.out.print("Digite o número para verificarmos na sequência: ");
        int quantidadeNumeros = teclado.nextInt();

        String existe = "Termo não existe na sequência.";

        int passado = 0;
        int atual = 1;
        System.out.printf("%d - %d", passado, atual);
        for (int i = 0; i < quantidadeNumeros; i++){
            int termo = atual + passado;
            System.out.printf(" - %d", termo);

            if (Objects.equals(termo, quantidadeNumeros)) {
                existe = "Termo existente na sequência.";
                break;
            }

            passado = atual;
            atual = termo;
        }

        System.out.println("\n" + existe);
    }
}