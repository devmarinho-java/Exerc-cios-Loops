import java.util.Scanner;

public class Exercicio2 {


    /*Crie um programa que peça uma nota, entre zero e dez
    mostre uma mensagem caso o valor seja inválido, e continue pedindo 
    a nota até que o usuário informe um valor válido.
     * 
     */
    public static void main(String[] args) {

        int nota;

        System.out.println("informe uma nota entre 0 e 10");

        Scanner scan = new Scanner(System.in);
        nota = scan.nextInt();



        while(nota < 0 | nota > 10){
            System.out.println("Nota inválida! Digite novamente");
            nota = scan.nextInt();
        }
        
    }
    


}
