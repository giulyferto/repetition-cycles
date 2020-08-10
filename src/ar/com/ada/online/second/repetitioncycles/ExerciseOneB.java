package ar.com.ada.online.second.repetitioncycles;

import java.util.Scanner;

public class ExerciseOneB {
        public static void main(String[] args) {

            //se declaran las variables
            int sum = 0;
            int[] arraynumbers = new int[10];

            // se habilita el uso del teclado
            Scanner keyboard = new Scanner(System.in);

            for (int i = 0; i < arraynumbers.length; i++) {
                System.out.printf("ingrse el valor para la posicion del %d en el arreglo: ", i);
                arraynumbers[i] = keyboard.nextInt();

                sum += arraynumbers[i];
            }

            //Se muestra el resultado
            System.out.println("El resultado de la suma es de: " + sum);
        }
    }