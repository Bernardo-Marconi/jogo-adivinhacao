import java.util.Scanner;
import java.util.Random;

public class JogoAdivinhação {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        Random gerador = new Random();

        System.out.println("jodo de adivinhação.");

        byte numeroAleatorio = (byte)gerador.nextInt(100);

        System.out.println("digite o número sorteado entre 0 e 100: ");
        byte numero = scan.nextByte();

        byte tentativas = 1;

    while (numero != numeroAleatorio){

        System.out.println("Número errado!");

    if(numero > numeroAleatorio){

        System.out.println("Dica o número sorteado é menor que o número escolhido!");
    
    }else{

        System.out.println("Dica o número sorteado é maior que o número escolhido!");
    }

        System.out.println("tente novamente: ");
        numero = scan.nextByte();

         tentativas++;

        }

    if(numero == numeroAleatorio){

        System.out.printf("Parabéns, o número sorteado é: (%d)\nO número de tentativas foi de: (%d)",numero,tentativas);
    }

        scan.close();
    }
}
