/*13. Escreva um algoritmo que leia um número do teclado até que encontre um
número menor ou igual a 1. */

import java.util.Scanner;

public class Q13 {
    public static void main (String [] args){
        Scanner input = new Scanner (System.in);
        int num;
        do {
            System.out.println ("Digite um número menor que 1");
            num = input.nextInt();
        }while (num >= 1);
    }
    
}
