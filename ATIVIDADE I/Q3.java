package com.mycompany.testedoctorz;

import java.util.Scanner;

/*3. Ler um valor inteiro (aceitar somente valores entre 1 e 10) e escrever a
tabuada de 1 a 10 do valor lido.*/

public class Q3 {
    public static void main (String [] args){
        Scanner input = new Scanner (System.in);
        int num;
            System.out.println("Digite um número entre 1 e 10: ");
                 num = input.nextInt();
                     if (num <= 10 && num >= 0){
                        for (int i = 0; i <= 10; i++){
            System.out.println(num+" x "+i+" = "+num*i);
                        }
                    }else{
            System.out.println("Digite um número entre 1 e 10");
                    }       
    }
}
