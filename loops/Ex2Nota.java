package loops;

import java.util.Scanner;

/*
Faça um programa que peça uma nota, entre zero e dez.
Mostre uma mensagem caso o valor seja inválido
e continue pedindo
até que o usuário informe um valor válido.
*/

public class Ex2Nota {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nota;

        System.out.println("Nota: ");
        nota = scanner.nextInt();

        while (nota < 0 || nota > 10) {
            System.out.println("Nota inválida. Tente novamente");
            nota = scanner.nextInt();

        }
    }
}