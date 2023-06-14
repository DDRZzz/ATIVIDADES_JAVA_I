package br.ifsertaope.cs.av.revisao;
import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class impar_par {
    public static void main(String[] args){
        int num, qtdpar = 0, qtdimpar = 0;
        Scanner input = new Scanner (System.in);
        for (int i = 0; i < 5; i++){
        System.out.println("Digite um número");
        num = input.nextInt();
        if(num % 2 == 0){
            qtdpar++;
        }
        else{
            qtdimpar++;
        }
        }
        System.out.println("A quantidade de números pares e ímpares é respectivamente: "+qtdpar+", "+qtdimpar);
        
    }
    
}
