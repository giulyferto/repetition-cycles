package ar.com.ada.online.second.repetitioncycles;

import java.util.Scanner;

public class ExerciseTwo {
    public static void main(String[] args) {

        //Se definen las variables
        double[] arrayNumberOne;
        double[] arrayNumberTwo;
        double[] sumResult;
        int arrayLenght;

        //Se habilita el uso del teclado
        Scanner keyboard = new Scanner(System.in);

        //Se pide el tamaño del arreglo
        System.out.print("Ingrese la cantidad de veces que quiere sumar dos numeros: ");
        arrayLenght = keyboard.nextInt();

        arrayNumberOne = new double[arrayLenght];
        arrayNumberTwo = new double[arrayLenght];
        sumResult = new double[arrayLenght];

        //Se le piden los numeros al usuario

        for (int i = 0; i < arrayLenght; i++) {
            System.out.printf("\nIngrese el valor del primer numero en la posicion %d del arreglo: ", i +1);
            arrayNumberOne[i] = keyboard.nextDouble();

            System.out.printf("\nIngrese el valor del segundo numero en la posicion %d del arreglo: ", i+1);
            arrayNumberTwo[i] = keyboard.nextDouble();


        }

        //Se hace la suma
        for (int i = 0; i <arrayLenght; i++) {
            sumResult[i] = arrayNumberOne[i] + arrayNumberTwo[i];
        }

        //Se muestra el resultado
        System.out.println("El resultado de la suma de los elementos de los arreglos es: ");
        for (int i = 0; i < arrayLenght; i++) {
            System.out.printf("\nindice: %d, valor %.2f\n",i, sumResult[i]);
        }
    }
}
