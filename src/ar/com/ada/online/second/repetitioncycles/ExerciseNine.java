package ar.com.ada.online.second.repetitioncycles;

import java.util.Scanner;

public class ExerciseNine {
    public static void main(String[] args) {
        //Se definen las variables
        int[][] numberA;
        int[][] numberB;
        int[][] result;
        int row;
        int column;
        Scanner keyboard = new Scanner(System.in);

        //Se pide que se determinen las dimensiones de la matriz
        System.out.print("Ingrese el numero de filas de la matriz: ");
        row = keyboard.nextInt();

        System.out.print("Ingrese el numero de columnas de la matriz: ");
        column = keyboard.nextInt();

        //Se le asignan las dimensiones a las matrices
        numberA = new int[row][column];
        numberB = new int[row][column];
        result = new int[row][column];

        //Se piden los valores al usuario
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print("\nIngrese el primer valor: ");
                numberA[i][j] = keyboard.nextInt();

                System.out.println("\nIngrese el segundo valor: ");
                numberB[i][j] = keyboard.nextInt();

            }
        }

        //Se suman las matrices
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                result[i][j] = numberA[i][j] + numberB[i][j];
            }
        }

        //Se muestra el resultado
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.printf("\nEl resultado en la posicion %d %d es de: %d",i,j,result[i][j]);
            }
        }
    }
}
