import java.util.Scanner;

/* Crie um programa que leia conjuntos de dois valores,
 * O primeiro representando o nome do aluno e 
 * O segundo representando sua idade.
 * O programa deverá ser encerrado quando o campo nome receber o valor 0.
 */

public class Exercicio1{

    public static void main(String[] args) {
        

Scanner scan = new Scanner(System.in);

        String nome;
        int idade;

        while(true){


            System.out.println("nome : ");
            nome = scan.next();
            if(nome.equals("0")){
                break;
            }
            System.out.println("Idade : ");
            idade = scan.nextInt();


        }



    }
}