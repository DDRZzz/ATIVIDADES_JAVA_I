package br.ifsertaope.cs.av.revisao;
import java.util.Scanner;
/**
 *
 * @author Aluno
 */
public class antecessor_sucessor {
    public static void main (String [] args){
    int num = 0, sucessor = 0, antecessor = 0;
    Scanner input = new Scanner (System.in);
        System.out.println("Digite um número: ");
        num = input.nextInt();
        antecessor = num-1;
        sucessor = num+1;
        System.out.println("O seu antecessor é: "+antecessor);
        System.out.println("O seu sucessor é: "+sucessor);
    }
}
