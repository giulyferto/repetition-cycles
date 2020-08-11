package ar.com.ada.online.second.repetitioncycles;

import java.util.Scanner;

public class ExerciseThree {
    public static void main(String[] args) {

        //Se definen las variables
        int sizeArray;
        String[] name;
        double[] gpa;
        String auxName;
        double auxGPA;
        Scanner keyboard = new Scanner(System.in);

        //Se piden la cantidad de alumnos
        System.out.print("Ingrese la cantidad de alumnos: ");
        sizeArray = keyboard.nextInt();

        //Se inicializa las variables con el tamaño del array
        name = new String[sizeArray];
        gpa = new double[sizeArray];

        //se ingresan los nombres y los promedios
        for (int i = 0; i < sizeArray; i++) {
            System.out.printf("Ingrese el nombre del estudiante en la posicion %d de i: ", i);
            keyboard.nextLine();
            name[i] = keyboard.nextLine();


            System.out.printf("Ingrese el promedio del estudiante en la posicion %d de i: ", i);
            gpa[i] = keyboard.nextDouble();

        }

        //Se determina cual es el alumno con el mayor promedio
        for (int i = 0; i < sizeArray; i++) {
            for (int j = i + 1; j < sizeArray; j++) {

                if (gpa[j] > gpa[i]) {

                    auxGPA = gpa[i];
                    gpa[i] = gpa[j];
                    gpa[j] = auxGPA;

                    auxName = name[i];
                    name[i] = name[j];
                    name[j] = auxName;
                }
            }
        }

        //Se muestra el resultado

        for (int i = 0; i < sizeArray; i++) {
            System.out.printf("\nEl alumno con el promedio numero %d es %s, con un promedio de %.2f", i + 1, name[i], gpa[i]);
            //System.out.println("El alumno " + name[i] + " tiene un promedio de " + gpa[i]);
        }


    }
}