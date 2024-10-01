import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite um texto para verificarmos se encontramos a letra [a]: ");
        String texto = teclado.nextLine();

        int qtdOcorrencias = 0;
        String existe = "A letra [a] não foi encontrada na frase passada.";

        for (int i=0; i < texto.length(); i++){
            char letra = 'a';
            char caractere = texto.toLowerCase().charAt(i);

            if(caractere == letra){
                qtdOcorrencias++;
                existe = "A letra [a] foi encontrada " + qtdOcorrencias + " vezes";
            }
        }

        System.out.println(existe);
    }
}