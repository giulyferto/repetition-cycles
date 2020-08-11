package ar.com.ada.online.second.repetitioncycles;

import java.util.Scanner;

public class ExerciseSeven {
    public static void main(String[] args) {

        //Se definen las variables
        int amountDriver;
        int[][] kilometers;
        String[] driversName;
        int[] totalKM ;
        Scanner keyboard = new Scanner(System.in);

        //Se definen los tamaños del arreglo y de la matriz
        System.out.print("Ingrese la cantidad de choferes: ");
        amountDriver = keyboard.nextInt();

        kilometers = new int[amountDriver][5];
        driversName = new String[amountDriver];
        totalKM = new int[amountDriver];

        //Se piden los datos del usuario
        for (int i = 0; i < amountDriver; i++) {
            System.out.printf("\nIngrese el nombre del chofer numero %d: ", i + 1);
            keyboard.nextLine();
            driversName[i] = keyboard.nextLine();

            for (int j = 0; j < 5; j++) {
                System.out.printf("\nIngrese la cantidad de kilometros recorridos en el dia %d: ", j +1);
                kilometers[i][j] = keyboard.nextInt();
            }

        }

        //Se calcula el total de kilometros
        for (int i = 0; i < amountDriver; i++) {
            totalKM[i] = 0;
            for (int j = 0; j < 5; j++) {
                totalKM[i] = totalKM[i] + kilometers [i][j];
            }
        }


        //Se muestra el resultado
        for (int i = 0; i < amountDriver; i++) {
            System.out.printf("\n El chofer %s\n",driversName);

            for (int j = 0; j < 5; j++) {
                System.out.printf("\nEn el dia %d hizo %d kilometros",j + 1, kilometers[i][j]);
            }
            System.out.printf("\nSumando un total de %d kilometros\n", totalKM[i]);
        }

    }
}
