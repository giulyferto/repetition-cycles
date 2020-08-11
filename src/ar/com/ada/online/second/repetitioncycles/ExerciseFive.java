package ar.com.ada.online.second.repetitioncycles;

import java.util.Scanner;

public class ExerciseFive {
    public static void main(String[] args) {
        //Se definen las variables
        int[] element = new int[6];
        int auxElement;
        Scanner keyboard = new Scanner(System.in);

        //Se piden los datos del usuario
        for (int i = 0; i < element.length; i++) {
            System.out.printf("Ingrese el primer elemento en la posicion %d del arreglo: ", i);
            element[i] = keyboard.nextInt();
        }

        //Se cambia el orden de los elementos
        for (int i = 0; i < element.length; i++) {
            auxElement = element[i];
            element[i] = element[5 - i];
            element[5 - i] = auxElement;
            i = i + 1;
        }

        //Se muestra el resultado
        for (int i = 0; i < element.length; i++) {
            System.out.printf("\nEl elemento numero %d es: %d", i, element[i]);
        }
    }
}
