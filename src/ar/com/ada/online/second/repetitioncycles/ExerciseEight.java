package ar.com.ada.online.second.repetitioncycles;

import java.util.Scanner;

public class ExerciseEight {
    public static void main(String[] args) {

        //Se definen las variables
        double[][] sale = new double[5][5];
        double higherSale;
        Scanner keyboard = new Scanner(System.in);

        //Se piden los datos del usuario
        for (int i = 0; i < sale.length; i++) {
            for (int j = 0; j < sale.length; j++) {
                System.out.printf("Ingrese el monto de la venta del vendedor %d en el dia %d: \n", i + 1, j + 1);
                sale[i][j] = keyboard.nextDouble();
            }
        }

        //Se determina cual es la mayor venta
        higherSale = sale [0][0];
        for (int i = 0; i < sale.length; i++) {
            for (int j = 0; j < sale.length; j++) {
                if (sale[i][j] > higherSale){
                    higherSale = sale[i][j];
                }
            }
        }

        //Se muestra el resultado
        System.out.println("\nLa mayor venta es de: " + higherSale);
    }
}
