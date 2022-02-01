package loops;

import java.util.Scanner;

/*
Faça um programa que leia 5 números
e informe o maior número
e a média desses números.
*/

public class Ex3MaiorEMedia {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int count = 0;
        int numero;
        int soma = 0;
        int maiorNum = 0;

        do {
            System.out.println("Numero: ");
            numero = scan.nextInt();

            soma = soma + numero;

            if (numero > maiorNum) {
                maiorNum = numero;
            }

            count++;

        } while (count < 5);

        System.out.println("Maior: " + maiorNum);
        System.out.println("Média: " + soma / 5);
    }
}
