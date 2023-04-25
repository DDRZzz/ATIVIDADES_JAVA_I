/*6. Utilizando a estrutura de repetição for, faça um programa que receba 10
números e conte quantos deles estão no intervalo [10,20] e quantos deles estão
fora do intervalo, escrevendo estas informações. */

import java.util.Scanner;

public class Q6 {
    public static void main (String [] args){
    Scanner input = new Scanner (System.in);
    int num, entre = 0,naoentre = 0;

    for (int i=0;i<10;i++){
        System.out.println("Digite o número da posiçáo "+i);
        num = input.nextInt();
        if(num >= 10 && num <= 20){
            entre++;
        }else{
            naoentre++;
        }
    }
    System.out.println("A quantidade de números entre 10 e 20 é: "+entre);
    System.out.println("\nA quantidade de números que não estão entre 10 e 20 é: "+naoentre);
    }
}
