/*11. Faça um programa que peça ao usuário um número entre 12 e 20. Se a
pessoa digitar um número diferente, mostrar a mensagem "entrada inválida" e
solicitar o número novamente. Se digitar correto mostrar o número digitado. */

import java.util.Scanner;

public class Q11 {
    public static void main (String [] args){
        Scanner input = new Scanner (System.in);
        int num;
        System.out.println("Digite um número entre 12 e 20");
        num = input.nextInt();
        if(num > 12 && num < 20){
            System.out.println("o número digitado foi: "+num);
        }else{
            while(num <= 12 && num >= 20){
                System.out.println("entrada invalida");
            }
        }
    }
}
