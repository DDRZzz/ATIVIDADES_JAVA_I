
package br.ifsertaope.cs.av.revisao;
import java.util.Scanner;
/**
 *
 * @author Aluno
 */
public class media {
    public static void main (String[] args){
        int nota1, nota2;
        double media;
        Scanner input = new Scanner(System.in);
        System.out.println("Digite a primeira nota: ");
        nota1 = input.nextInt();
        System.out.println("Digite a segunda nota: ");
        nota2 = input.nextInt();
        media = (nota1 + nota2)/2;
        System.out.println("A media das notas é: "+media);
        
    }
}
