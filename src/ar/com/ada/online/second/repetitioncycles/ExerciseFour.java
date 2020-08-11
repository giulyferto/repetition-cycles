package ar.com.ada.online.second.repetitioncycles;

import java.util.Scanner;

public class ExerciseFour {
    public static void main(String[] args) {

        //Se definen las variables
        int[] products = new int[10];
        int[] requests = new int[10];
        int[] stockRefill = new int[10];
        Scanner keyboard = new Scanner(System.in);

        //Se piden los datos del usuario
        for (int i = 0; i < 10; i++) {
            System.out.printf("Ingrese el stock del producto nro %d: ", i + 1);
            products[i] = keyboard.nextInt();

            System.out.printf("Ingrese la cantidad de pedidos para el producto nro %d: ", i + 1);
            requests[i] = keyboard.nextInt();

        }
        //Se inicia el proceso de control de la existencia de los productos

        for (int i = 0; i < products.length; i++) {
            if (products[i] > requests[i]) {
                stockRefill[i] = products[i];
            } else if (products[i] < requests[i]) {
                stockRefill[i] = (requests[i] - products[i]) * 2;
            } else {
                stockRefill[i] = requests[i];
            }
        }


        //Se muestra el resultado
        for (int i = 0; i < 10; i++) {
            System.out.printf("\nSe tienen que reponer %d unidades para el producto nro %d", stockRefill[i], i + 1);
        }
    }
}
