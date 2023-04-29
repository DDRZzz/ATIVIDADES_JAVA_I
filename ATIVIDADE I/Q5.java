//5. Ler 10 números e imprimir quantos são pares e quantos são ímpares.

import java.util.Scanner;

public class Q5 {
    public static void main (String [] args){
        Scanner input = new Scanner (System.in);
        int num, qtdi = 0,qtdp = 0;
        for (int i = 0; i< 10; i++){
            System.out.println("Digite o número da posição "+i);
            num = input.nextInt();
            if(num % 2 == 1){
                qtdi++;
            }else{
                qtdp++;
            }
        }
        System.out.println("A quantidade de números ímpares é: "+qtdi);
        System.out.println("\nA quantidade de números pares é: "+qtdp);
    }
}
