package EssercizioUno;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;
public class Primo {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            int[] arr = new int[5];

            for (int i = 0; i < arr.length; i++) {
                arr[i] = random.nextInt(10) + 1;
            }

            System.out.print("Array random: ");
            for (int i : arr) {
                System.out.print(i + " ");
            }
            System.out.println("Che numero vuoi inserire? ");
            int nuovoNumero;
            try {
                nuovoNumero = scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Deve essere un numero Intero");
                break;
            }
            System.out.println("In che posizione? ");
            int posizione;
             try {
                 posizione = scanner.nextInt();
             } catch (InputMismatchException e) {
                 System.out.println("Deve essere un numero Intero");
                 break;
             }


            if (posizione >= 1 && posizione <= arr.length + 1) {
                arr[posizione - 1] = nuovoNumero;

                System.out.println("Nuovo Array: ");
                for (int i = 0; i < arr.length; i++) {
                    System.out.print(arr[i]);
                    if (i == arr.length - 1) {
                        System.out.println();
                    } else {
                        System.out.print(" ");
                    }
                }
            } else {
                System.out.println("Numero supera la lunghezza del array");
            }

            System.out.println("Inserisci un altro numero per continuare" +
                    "oppure 0 per uscire. ");
            int userInput = scanner.nextInt();

            if (userInput == 0) {
                break;
            }
        }
    }
}