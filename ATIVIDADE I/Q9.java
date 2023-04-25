//9. Crie um programa para ler 3 notas e mostrar a média delas.
import java.util.Scanner;
public class Q9 {
    public static void main(String [] args) {
        float nota, soma = 0;
        int qtd = 0;

        Scanner input = new Scanner (System.in);
        while(qtd < 3){
            System.out.println("Digite a nota "+qtd);
            nota = input.nextFloat();
            soma = nota + soma;
            qtd++;
        }
        System.out.println("A média das tres notas é: "+soma/3);
    }
}
