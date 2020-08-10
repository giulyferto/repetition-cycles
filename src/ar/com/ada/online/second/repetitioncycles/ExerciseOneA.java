package ar.com.ada.online.second.repetitioncycles;

import java.util.Scanner;

public class ExerciseOneA {
    public static void main(String[] args) {
        //se declaran las variables
        int sum = 0;
        int[] arraynumbers = new int[10];

        // se habilita el uso del teclado
        Scanner keyboard = new Scanner(System.in);

        //se piden los datos
        for (int i = 0; i < 10; i++) {
            System.out.printf("ingrse el valor para la posicion del %d en el arreglo: ", i);
            arraynumbers[i] = keyboard.nextInt();

        }
        //Se realiza la suma 
        for (int i = 0; i < arraynumbers.length; i++) {
            sum += arraynumbers[i];
        }

        //Se muestra el resultado
        System.out.println("El resultado de la suma es de: " + sum);

    }
}
