import java.util.Scanner;

/*Crie um programa que leia 5 números
 * Informe o maior número
 * Informe a média da soma dos números informados.
 */

public class Exercicio3 {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);


        int numero = 0;
        int maior = 0;
        int soma = 0;
        int count = 0;

        do{

            System.out.println("Número :");
            numero = scan.nextInt();

            maior = maior + numero;
            soma = soma + numero;
            
            count ++;

        }while(count < 5);

        System.out.println("O maior numero eh : "  +  maior);
        System.out.println("A media dos numeros é " + (soma / 5));
    }
    
}
