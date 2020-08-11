package ar.com.ada.online.second.repetitioncycles;

import java.util.Scanner;

public class ExerciseSix {
    public static void main(String[] args) {
        int[][] matriz = new int[4][4];
        int zeroCounter = 0;
        Scanner keyboard = new Scanner(System.in);

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.printf("Ingrese el valor para la matriz en la posicion %d, %d: ",i,j);
                matriz[i][j] = keyboard.nextInt();
            }
        }
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] == 0) {
                    zeroCounter = zeroCounter + 1;
                }
            }
        }

        System.out.println("\nLa cantidad de ceros en la matriz es: " + zeroCounter);
    }
}
