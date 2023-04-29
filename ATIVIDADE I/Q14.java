/*14. Crie um programa que leia um número do teclado até que encontre um
número igual a zero. No final, mostre a soma dos números digitados. */

import java.util.Scanner;

public class Q14 {
    public static void main (String [] args){
        Scanner input = new Scanner (System.in);
        int num, soma = 0;

        do {
            System.out.println("Digite um número qualquer: ");
            num = input.nextInt();
            soma += num; 

        }while(num != 0);
            System.out.println("A soma dos números digitados é: "+soma);
    }
}
