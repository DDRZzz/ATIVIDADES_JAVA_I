/*10. Faça um programa que mostre a tabuada de um número N (N será lido do
teclado). */

import java.util.Scanner;

public class Q10 {
    public static void main(String [] args) {
        Scanner input = new Scanner (System.in);
        int num, contador = 0,result;
        System.out.println("Digite um número: ");
        num = input.nextInt();
        while(contador < 11){
            result = num*contador;
            System.out.println(num+" x "+contador+" = "+result);
            contador++;
        }
    }
}
