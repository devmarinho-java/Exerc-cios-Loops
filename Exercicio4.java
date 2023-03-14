import java.util.Scanner;

public class Exercicio4 {

    /*Crie um programa que peça N números inteiros 
     * Calcule e mostre a quantidade de números pares
     * e a quantidade de números ímpares
     */

    public static void main(String[] args) {
        
            Scanner scan = new Scanner(System.in);

            int qtdNumeros = 0;
            int qtdPares = 0; 
            int qtdImpares = 0;
            int count = 0;

            System.out.println("Informe a quantidade de numeros");
            qtdNumeros = scan.nextInt();

            do{
                System.out.println("Numero : ");
                int numero = scan.nextInt();

                if(numero % 2 == 0) qtdPares++;
                    else qtdImpares++;
                    
                count ++;

            }while(count < qtdNumeros);

            System.out.println("Qantidade Par: " + qtdPares);
            System.out.println("Quantidade Impares: " + qtdImpares);

    }
        
}
    

