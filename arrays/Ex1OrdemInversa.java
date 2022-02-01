package arrays;

/*
Crie um vetor de 6 números inteiros
e mostre-os na ordem inversa.
*/

public class Ex1OrdemInversa {
    public static void main(String[] args) {
        int[] numeros = { 1, 2, 3, 4, 5, 6 };

        System.out.print("Numeros: ");
        int count = 0;
        while (count < (numeros.length)) {
            System.out.print(numeros[count] + " ");
            count++;
        }

        System.out.print("\nNumeros: ");
        for (int i = (numeros.length - 1); i >= 0; i--) {
            System.out.print(numeros[i] + " ");
        }
    }
}
