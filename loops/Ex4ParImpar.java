package loops;

import java.util.Scanner;

/*
Faça um programa que peça N números inteiros,
calcule e mostre a quantidade de números pares
e a quantidade de números impares.
*/

public class Ex4ParImpar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Quantidade: ");
        int quantidade = scanner.nextInt();

        int count = 0;
        int numero;
        int quantidadePares = 0;
        int quantidadeImpares = 0;

        do {
            System.out.println("Numero: ");
            numero = scanner.nextInt();

            if (numero % 2 == 0) {
                quantidadePares++;
            } else {
                quantidadeImpares++;
            }

            count++;

        } while (count < quantidade);

        System.out.println("Pares: " + quantidadePares);
        System.out.println("Impares: " + quantidadeImpares);
    }
}
